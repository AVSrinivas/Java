class Seenu{
  private int age;
  private String name;

  public int getAge()
  {
    return age;
  }
  public void setAge(int n)
  {
    age = n;
  }
  public String getName()
  {
    return name;
  }
  public void setName(String s)
  {
    name = s;
  }

}
public class Demo 
{
    public static void main(String[] args) 
    {
      Seenu f =new Seenu();
      f.setAge(20);
      f.setName("Test");
      System.out.println(f.getName() + ":" + f.getAge());
      }
}


