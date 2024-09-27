class Road
{
 public static void capture()
 {
  System.out.println("Running on road");
  focus();
 }
 public static void focus()
 {
  System.out.println("Running on track");
  capture();
 }
}