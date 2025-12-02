package ed.mayo.pkg19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Cola1 extends JFrame implements ActionListener
{
    static Nodo cab,p,q,nuevo;
    static Scanner teclado=new Scanner(System.in);
    JLabel label1,label2,resultado;
    JButton boton1,imprimir,retirar;
    
    Cola1()
    {
        cab=new Nodo(-999,null);
        cab.sig=cab;
        setLayout(null);
        label1=new JLabel("COLA ");
        label1.setBounds(10,20,200,30);
        add(label1);
        label2=new JLabel("Digite dato:");
        label2.setBounds(10,60,100,30);
        add(label2);
        resultado=new JLabel("Resultado");
        resultado.setBounds(10,90,100,30);
        add(resultado);
        boton1=new JButton("Finalizar");
        boton1.setBounds(300,210,100,30);
        add(boton1);
        boton1.addActionListener(this);
        imprimir=new JButton("Imprimir");
        imprimir.setBounds(300,250,100,30);
        add(imprimir);
        imprimir.addActionListener(this);
        retirar=new JButton("Retirar");
        retirar.setBounds(300,290,100,30);
        add(retirar);
        retirar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==boton1) 
        {
            System.exit(0);
        }
        if (e.getSource()==imprimir) 
        {
            imprimir();
        }
        if (e.getSource()==retirar) 
        {
            retirar();
        }
    }
    
    void insertar(int dato)
    {
        nuevo=new Nodo(dato,null);
        nuevo.sig=cab.sig;
        cab.sig=nuevo;
        cab=nuevo;
    }        
    
    void imprimir()
    {
        String cad=" ";
        q=cab.sig;
        p=q.sig;
        while (p!=q)
        {
            System.out.print(" "+p.info);
            cad=cad+p.info+"  ";
            p=p.sig;
        }  
        resultado.setText(cad);
        System.out.println();
    }   
    
    void retirar()
    {   q=cab.sig;
        p=q.sig;
        q.sig=p.sig;
        if (q==q.sig)
            cab=q;
    }        
    public static void main(String[] args)
    {
        Cola1 l=new Cola1();
        l.setBounds(10,20,500,400);
        l.setVisible(true);
        l.insertar(5);
        l.insertar(3);
        l.insertar(1);   
    }
}