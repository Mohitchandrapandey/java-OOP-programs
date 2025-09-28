class bank{
    void acountno()
    {
        System.out.println("Account number: 85452841");
    }
}

 class holdername extends bank{
  void holdername(){ 
    System.out.println("Name: mohit");
   }

}

public class inheritance1{
    public static void main(String[] args){
        {
            holdername  hn=new holdername();
            hn.acountno();
        }

}
}
