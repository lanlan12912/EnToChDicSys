package pers.lanlan.dictsys.view;

import sun.tools.jps.Jps;

import javax.swing.*;
import java.awt.*;

public class MainMenuView {
    public void showView(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame  = new JFrame("英汉词典");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出触发关闭
        frame.setLayout(new BorderLayout());
        frame.setLocation(350,100);
        frame.add(searchView(),BorderLayout.NORTH);//标题以及查询框
        frame.add(lexiconView(),BorderLayout.WEST);//词库以及词库操作框
        frame.add(wordListView(),BorderLayout.CENTER);// 单词列表
        frame.add(wordInfoView(),BorderLayout.EAST);// 单词展示框
        frame.add(corpRightView(),BorderLayout.SOUTH);//版权区域
        //frame.pack();//自动适配
        frame.setSize(600,500);
        frame.setVisible(true);
    }

    /**
     * 顶部搜索框与搜索按钮
     *
     * */
    public JPanel searchView(){
        JPanel panel = new JPanel(new FlowLayout());
        JTextField textField = new JTextField(30);
        JButton search = new JButton("<html><body><div style='font-size:11px;font-family:黑体;'><button>查询</button></div></body></html>");
        panel.add(textField);
        panel.add(search);
        return panel;
    }

    /**
     * 左侧词库列表
     *
     * */
    public JPanel lexiconView(){
        JPanel panel = new JPanel(new FlowLayout());
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(2, 2, 2, 2),
                BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK)));
        JButton lexicon = new JButton("<html><body><div style='font-size:15px;font-family:黑体;'><button>新建词库</button></div></body></html>");
        panel.add(lexicon);
        return panel;
    }

    /**
     * 底部版权信息
     * */
    public JPanel corpRightView(){
        JPanel panel = new JPanel(new FlowLayout());
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(2, 2, 2, 2),
                BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK)));
        JButton lexicon = new JButton("<html><body><div style='font-size:8px;font-family:黑体;'>@copyright 海口龙华区惠影票文化影视传播经营部</div></body></html>");
        panel.add(lexicon);
        return panel;
    }

    /**
     * 单词列表
     * */
    public JPanel wordListView(){
        JPanel panel = new JPanel(new FlowLayout());
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(2, 2, 2, 2),
                BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK)));
        JButton lexicon = new JButton("<html><body><div style='font-size:15px;font-family:黑体;'><button>新建词库</button></div></body></html>");
        panel.add(lexicon);
        return panel;
    }

    /**
     * 单词信息面板
     * */
    public JPanel wordInfoView(){
        JPanel panel = new JPanel(new FlowLayout());
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(2, 2, 2, 2),
                BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK)));
        JButton lexicon = new JButton("<html><body><div style='font-size:15px;font-family:黑体;'><button>新建词库</button></div></body></html>");
        panel.add(lexicon);
        return panel;
    }
}
