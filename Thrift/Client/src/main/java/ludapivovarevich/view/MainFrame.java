package ludapivovarevich.view;

import ludapivovarevich.controller.Controller;
import ludapivovarevich.FamilyPlants;
import ludapivovarevich.view.family_plants.DialogChangeFamilyPlants;
import ludapivovarevich.view.family_plants.DialogCreateFamilyPlants;
import org.apache.thrift.TException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainFrame {
    private String title;
    private Dimension d;
    private Controller controller;
    private JFrame frame = new JFrame();

    private JToolBar tb = new JToolBar();
    private JButton addButton = new JButton("Добавить семейство");
    private JButton showButton = new JButton("Обновить семейство");
    private JButton changeButton = new JButton("Изменить описание семейства");
    private JButton deleteButton = new JButton("Удалить семейство");
    private JButton offButton = new JButton("Закрыть приложение");

    private JTabbedPane jtp = new JTabbedPane();
    private PanelInTab panelInTab;

    public MainFrame(String title, Dimension d, Controller controller) {
        this.title = title;
        this.d = d;
        this.controller = controller;
    }

    public void init() throws TException {
        frame.setTitle(title);
        frame.setSize(d);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        tb.add(addButton);
        tb.add(deleteButton);
        tb.add(changeButton);
        tb.add(showButton);
        tb.add(offButton);

        frame.getContentPane().add(tb, BorderLayout.NORTH);

        addButton.addActionListener(new createActionListener());
        changeButton.addActionListener(new changeActionListener());
        showButton.addActionListener(new showActionListener());
        deleteButton.addActionListener(new deleteActionListener());
        offButton.addActionListener(new offActionListener());

        frame.getContentPane().add(jtp);
        panelInTab = new PanelInTab(controller, MainFrame.this);

        controller.connect();
        frame.setVisible(true);
    }

    public class showActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            jtp.removeAll();

            try {
                List<FamilyPlants> list = controller.getListFamilyPlants();
                for(int i = 0; i < list.size(); i++){
                    FamilyPlants familyPlants = list.get(i);
                    jtp.addTab(familyPlants.getName(), panelInTab.getPanel(familyPlants.getId()));
                }
            } catch (TException e1) {
                e1.printStackTrace();
            }
        }
    }

    public class createActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DialogCreateFamilyPlants dialog = new DialogCreateFamilyPlants(controller);
            dialog.create();
        }
    }

    public class deleteActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                controller.deleteFamilyPlants(getSelectedIndexTab());
            } catch (TException e1) {
                e1.printStackTrace();
            }
        }
    }

    public class changeActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DialogChangeFamilyPlants dialog = new DialogChangeFamilyPlants(controller);
            dialog.change(getSelectedIndexTab());
        }
    }

    public class offActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.close();
            System.exit(0);
        }
    }

    public int getSelectedIndexTab(){
        return jtp.getSelectedIndex();
    }
}
