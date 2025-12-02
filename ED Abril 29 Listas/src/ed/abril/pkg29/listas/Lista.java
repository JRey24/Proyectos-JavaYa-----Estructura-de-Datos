package ed.abril.pkg29.listas;

public class Lista 
{
    
    static Nodo cab,nuevo,p;
    
        public static void main(String[] args)
        {
            cab= new Nodo (5,null);
            System.out.print(cab.info);
            System.out.println(" "+ cab.sig);
            
            nuevo=new Nodo(3,null);
            nuevo.sig=cab;
            cab =nuevo;
            System.out.print(cab.info);
            System.out.print(" "+cab.sig.info);
            System.out.println(" "+cab.sig.sig);
            
            nuevo=new Nodo(1,null);
            nuevo.sig=cab;
            cab=nuevo;
            System.out.print(cab.info);
            System.out.print(" "+cab.sig.info);
            System.out.print(" "+cab.sig.sig.info);
            System.out.println(" "+cab.sig.sig.sig);
            
            p=cab;
            while(p!=null){
                System.out.println(" "+p.info);
                p=p.sig;
            }
        }

}
