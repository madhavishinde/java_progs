public class RunEncap{

   public static void main(String args[]){
      Hidding encap = new Hidding();
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");

      System.out.print("Name : " + encap.getName()+ 
                             " Age : "+ encap.getAge() + "and Id : " + encap.getIdNum());
    }
}