package ed.mayo.pkg26;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Parcial_Entrega extends JFrame implements ActionListener 
{
    static Nodo cab,p,q,nuevo;
    static Scanner teclado=new Scanner(System.in);
    JLabel label1,label2,resultado;
    JButton boton1,imprimir,retirar,insertar,mayor,menor;
    JTextField caja;
    
    Parcial_Entrega()
    {
        cab=new Nodo(-999,null);
        cab.sig=cab;
        setLayout(null);
        label1=new JLabel("COLA ");
        label1.setBounds(10,20,200,30);
        add(label1);
        label2=new JLabel("Digite dato ");
        label2.setBounds(10,60,100,30);
        add(label2);
        
        caja=new JTextField();
        caja.setBounds(120,60,100,30);
        add(caja);
        
        
        resultado=new JLabel("Resultado ");
        resultado.setBounds(10,150,500,30);
        add(resultado);
        boton1=new JButton("Finalizar");
        boton1.setBounds(300,330,100,30);
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
        mayor=new JButton("Mayor");
        mayor.setBounds(450,210,100,30);
        add(mayor);
        mayor.addActionListener(this);
        menor=new JButton("Menor");
        menor.setBounds(450,250,100,30);
        add(menor);
        menor.addActionListener(this);
        insertar=new JButton("Insertar");
        insertar.setBounds(300,210,100,30);
        add(insertar);
        insertar.addActionListener(this);
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
        if (e.getSource()==mayor) 
        {
            mayor();
        }
        if (e.getSource()==menor) 
        {
            menor();
        }
         if (e.getSource()==insertar)
        {
            String cad=caja.getText();
            int valor=Integer.parseInt(cad);
            insertar(valor);
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
    void mayor()
    {
        if (cab.sig == cab) {
            resultado.setText("Contenido de la cola: [ Vacía ] | Mayor: Cola Vacía"); 
            return;
        }

        int maximo = Integer.MIN_VALUE; // Inicializamos con el valor entero más pequeño.
        p = cab.sig.sig; // Empezamos desde el primer elemento real de la cola.
        
        // Recorremos la cola para encontrar el valor máximo.
        while (p != cab.sig) {
            if (p.info > maximo) {
                maximo = p.info;
            }
            p = p.sig;
        }
        resultado.setText("Contenido de la cola: " + getColaContentString() + " | Mayor: " + maximo);
    }
    void menor()
    {
        if (cab.sig == cab) 
        {
            resultado.setText("Contenido de la cola: [ Vacía ] | Menor: Cola Vacía"); 
            return;
        }
        int minimo = Integer.MAX_VALUE;
        p = cab.sig.sig;
  
        while (p != cab.sig) 
        {
            if (p.info < minimo) 
            {
                minimo = p.info;
            }
            p = p.sig;
        }
        resultado.setText("Contenido de la cola: " + getColaContentString() + " | Menor: " + minimo);
    }
    private String getColaContentString() {
        String content = "";
        if (cab.sig == cab) 
        {
            return "Vacía";
        }
        p = cab.sig.sig;
        while (p != cab.sig) {
            content += p.info + " ";
            p = p.sig;
        }
        return "[ " + content.trim() + " ]";
    }        
    public static void main(String[] args)
    {
        Parcial_Entrega l=new Parcial_Entrega();
        l.setBounds(10,20,600,500);
        l.setVisible(true);
    }
}  