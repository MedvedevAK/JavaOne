import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame{
    public Window (){
        setTitle("Крестики нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,440);
        GameField mainPanel = new GameField();
        JPanel menuPanel = new JPanel(new GridLayout(1,2));
        menuPanel.setPreferredSize(new Dimension(0,40));
        getContentPane().add(mainPanel,BorderLayout.CENTER);
        getContentPane().add(menuPanel,BorderLayout.SOUTH);
        JButton jbStart = new JButton("Начать новую игру");
        JButton jbExit = new JButton("Выйти из игры");
        menuPanel.add(jbStart);
        menuPanel.add(jbExit);

        jbStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.gameStart();
            }
        });
        jbExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //Верхняя панель меню
        JMenuBar jmb = new JMenuBar();
        setJMenuBar(jmb);
        JMenu jmMenu = new JMenu("Меню");

        JMenuItem jmExit = new JMenuItem("Выход");


        JRadioButtonMenuItem jrbMenu = new JRadioButtonMenuItem("Компьютер");
        ButtonGroup group = new ButtonGroup();
        group.add(jrbMenu);
        jmb.add(jmMenu);
        jmMenu.add(jrbMenu);
        jmMenu.addSeparator();
        jmMenu.add(jmExit);

        jmExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

}
