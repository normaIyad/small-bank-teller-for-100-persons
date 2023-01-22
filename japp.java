import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random ;
public class japp extends JFrame implements ActionListener  {
      int [] arr = new   int [100]  ;  
      JFrame f ;
      static int num = 0  ;
      int i =-1 ;
      int sum  = 100;
      JLabel cl = new JLabel ( "number  of  wating  list : " ) ;
      JLabel k =  new JLabel ( "click hear to start " ) ;
      JLabel client_leave  =  new JLabel (  ) ;
       JLabel next  = new JLabel ( " next client  :   " ) ;
      JTextField t1, t2 , t3 , t4 ; 
      JPanel  n , o , s ;
      JButton st , leve , n1 , n2 , n3 , n4 ,br1 ,br2 , br3, br4 ;
   public japp(){
      next.setFont(next.getFont().deriveFont(20.0f));
      next.setForeground(Color.red); 
      cl.setFont(cl.getFont().deriveFont(20.0f));
      k.setFont(k.getFont().deriveFont(20.0f));
      client_leave.setFont( client_leave.getFont().deriveFont(20.0f));
     t1 = new JTextField("  ", 13);
     t2 = new JTextField("  ", 13);
     t3 = new JTextField("  ", 13);
     t4 = new JTextField("  ", 13);
    this.setTitle("Bank watting System ");
    this.setSize(700,600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setResizable(false);
    this.setLayout(null);
   f = new JFrame("  Bank watting System  ");
   f.setLayout(new GridLayout(3,1));
   st= new JButton("start");
   leve = new JButton("leve ");
   n1 = new JButton("next1");
   n2 = new JButton("next2");
   n3 = new JButton("next3");
   n4 = new JButton("next4");
   br1 = new JButton("Break1");
   br2 = new JButton("Break2");
   br3 = new JButton("Break3");
   br4 = new JButton("Break4"); 
   n = new JPanel();
   o = new JPanel();
   s = new JPanel();
   f.setSize(700, 600);
   f.add(o);
   o.add(n1);
   o.add(br1);
   o.add(n2);
   o.add(br2);
   o.add(n3);
   o.add(br3);
   o.add(n4);
   o.add(br4);
   o.add(t1);
   o.add(t2);
   o.add(t3);
   o.add(t4);
   f.add(n);
   n.add(new ClockPane());
   n.add(cl);
   n.add(next);
   n.add(client_leave) ;
   f.add(s);
   s.add(k);
   s.add(st);
   s.add(leve );
   f.show();
   n.setBackground(Color.LIGHT_GRAY);
   o.setBackground(Color.PINK);
   s.setBackground(Color.LIGHT_GRAY); 
   st.addActionListener(this);
   leve.addActionListener(this);
   n1.addActionListener(this);
   n2.addActionListener(this);
   n3.addActionListener(this); 
   n4.addActionListener(this) ; 
   br1.addActionListener(this); 
   br2.addActionListener(this); 
   br3.addActionListener(this);
   br4.addActionListener(this);
 }
 @Override
 public void actionPerformed(ActionEvent a ){   
    if("start".equals( a.getActionCommand()) && i == -1 ){
       t1.setCaretColor(Color.red);
       t1.setText(String.valueOf(rand()  ));  
       t2.setText(String.valueOf( rand() ));  
       t3.setText(String.valueOf( rand() ));  
       t4.setText(String.valueOf( rand() )); 
       cl.setText(" number  of  wating  list :"+String.valueOf(sum));
       i++ ;
    }
     if ( "next1".equals( a.getActionCommand()) && i != -1){
           t1.setText(String.valueOf( rand() ));
           cl.setText(String.valueOf( "  number  of  wating  list :" +sum));
           next.setText( " the next client is  : " +String.valueOf(101-sum));
     }   
     if( "next2".equals( a.getActionCommand())&& i != -1){
          t2.setText(String.valueOf( rand() ));
          cl.setText( " number  of  wating  list :" +String.valueOf(sum));
          next.setText(" the next client  is  : " + String.valueOf(101-sum));
     }  
      if( "next3".equals( a.getActionCommand())&&i != -1 ){
           t3.setText(String.valueOf( rand() ));
           cl.setText(" number  of  wating  list :"+String.valueOf(sum));
           next.setText( " the next client  is  : "+ String.valueOf(101-sum));
     }  
      if( "next4".equals( a.getActionCommand()) &&i != -1 ){
           t4.setText(String.valueOf( rand() ));
           cl.setText( " number  of  wating  list :"+String.valueOf(sum));
           next.setText(" the next client  is  : "+String.valueOf(101-sum));
     }  
       if( "Break1".equals( a.getActionCommand()) &&i != -1){
         t1.setText("its a break time ");
     }  
      if( "Break2".equals( a.getActionCommand())&&i != -1){
         t2.setText("its a break time ");
     }    
       if( "Break3".equals( a.getActionCommand())&&i != -1){
         t3.setText("its a break time ");
     } 
        if( "Break4".equals( a.getActionCommand()) && i != -1){
         t4.setText("its a break time ");
     } 
        if ("leve ".equals( a.getActionCommand()) && i != -1){
            rand2 () ;
        }
 
 } 
 public int rand ( ){
     int c=0 ;
          if ( num !=100 && sum!= -1 ){
                  arr[c]= num ;
                  c++;
                   sum-- ;
                   num++ ;
                  return (num);
          } 
   return (0);
 }
 public void rand2 ( ){
      
    Random rand = new Random() ;
    int rand_int1 = rand.nextInt(3)+1;
    if (rand_int1 == 1 ){
          t1.setText(String.valueOf(  rand() )); 
           client_leave.setText("leave client in service number  :  1 ");
    }
    if(rand_int1 == 2){
         t2.setText(String.valueOf(  rand() )); 
          client_leave.setText("leave client in service number  :  2 ");
    }
     if(rand_int1 == 3){
         t3.setText(String.valueOf(  rand() )); 
          client_leave.setText("leave client in service number  :  3 ");
    }
     if(rand_int1 == 4){
         t4.setText(String.valueOf(  rand() )); 
          client_leave.setText("leave client in service number  :  4");
    }
 }
    public static void main(String[] args) {
        japp japp = new japp();
      
    }
 
}
