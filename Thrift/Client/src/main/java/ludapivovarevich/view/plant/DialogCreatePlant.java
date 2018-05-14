package ludapivovarevich.view.plant;

import ludapivovarevich.Plant;
import ludapivovarevich.controller.Controller;
import org.apache.thrift.TException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogCreatePlant {

    private JDialog dialog = new JDialog();
    private Controller controller;

    public DialogCreatePlant(Controller controller){
        this.controller = controller;
    }

    public void create(int index){

        dialog.setSize(400,500);
        dialog.setLayout(new GridBagLayout());
        dialog.setLocationRelativeTo(null);

        JLabel plantLabel = new JLabel("Название цветка: ");
        JTextField plantTextField = new JTextField(10);

        dialog.add(plantLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        dialog.add(plantTextField, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        JLabel leafLabel = new JLabel("Размер листка: ");
        JTextField leafTextField = new JTextField(10);

        dialog.add(leafLabel, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        dialog.add(leafTextField, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        JLabel stemLabel = new JLabel("Размер стебля: ");
        JTextField stemTextField = new JTextField(10);

        dialog.add(stemLabel, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        dialog.add(stemTextField, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        JButton addNotation = new JButton("Добавить запись");

        dialog.add(addNotation, new GridBagConstraints(0, 6, 2, 1, 2, 2,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        dialog.pack();
        dialog.setVisible(true);

        addNotation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((plantTextField.getText()).trim().isEmpty() || (leafTextField.getText()).trim().isEmpty() ||
                        (stemTextField.getText()).trim().isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Одно или несколько полей не заполнены");
                    return;
                } else {
                    try {
                        Plant plant = new Plant(1, plantTextField.getText(), leafTextField.getText(), stemTextField.getText());
                        controller.addPlant(plant, index);
                    } catch (TException e1) {
                        e1.printStackTrace();
                    }

                    dialog.dispose();
                }
            }
        });
    }
}
