public class Mobile
{
private static String unlock="Pin";
//getter
 public static String getUnlock()
 {
 return unlock;
 }
 
 //setter
 public static void setUnlock(String newUnlock)
 {
 if(newUnlock.equals("FIngerPrint")|| newUnlock.equals("pattern")|| newUnlock.equals("face")||newUnlock.equals("password"))
 {
 System.out.println("new unlock is "+newUnlock);
 unlock=newUnlock;
 }
 else{
 System.out.println("you can't change the unlock");
 
 }
 }
}