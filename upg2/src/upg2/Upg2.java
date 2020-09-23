package upg2;
import java.util.Scanner;
public class Upg2 {
	public static boolean areEqual(int list1[], int list2[],int n) 
    { 

        for (int i = 0; i < n ; i++) 
//        	System.out.println(list1[i]);
//    		System.out.println(list2[i]);
            if (list2[i] != list1[i]) 
                return false; 
  
        return true; 
    } 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Scanner Obj = new Scanner(System.in);
            String antal1 = Obj.nextLine();
            int antal = Integer.parseInt(antal1.trim());
            if(antal>10) {
                System.out.println("no"); 
            }
            else if(antal<3) {
                System.out.println("no"); 
            }
            else {
                String num = Obj.nextLine();
                
                String list1[] = num.split(" ");
                
                
                int[] list;
                list = new int[antal];
                for (int i = 0; i<antal; i++) {
                    list[i] = Integer.parseInt(list1[i].trim());
                    
                }
                
            
                
                double dy = list[2]-list[1];
                double dx = list[1]-list[0];
                
                    double b = dy/dx;
                    double c = list[1]-b*list[0];
                    long limit = 100000*10000;
                   
                    if(c<-9){  
                        System.out.println("no");  
                    }  
                    else if(c>9){  
                        System.out.println("no");  
                    }  
                    else if(b<-9){  
                        System.out.println("no");  
                    }  
                    else if(b>9){  
                        System.out.println("no");  
                  
                    }
                    else if((long) b != b) {
                        System.out.println("no");  
                    }
                    else if((long) c != c) {
                        System.out.println("no");  
                    }
                    else{ 
                        int b1 = (int)b;
                        int c1 = (int)c;
                        int[] monstlist;
                    	monstlist = new int[antal];
                    	monstlist[0] = list[0];
                    	for(int i=1;i<antal;i++) {
                     	   monstlist[i] = monstlist[i-1]*b1+c1;
                        }
//                    	for(int i=0;i<antal;i++) {
//                    		System.out.println(monstlist[i]);
//                    		System.out.println(list[i]);
//                    	}
                    	long aNext = monstlist[monstlist.length-1]*b1+c1;
                    
                    	if(areEqual(list, monstlist,antal))  {
                    //		long aNext = monstlist[monstlist.length-1]*b1+c1;
//                    		if(aNext>limit) {
//                            System.out.println("no");  
//                    		}
//                    		else if (aNext<-limit) {
//                            System.out.println("no");
//                    		}
//                    		else {
                    			System.out.println(aNext);
//                    		}
                    	}
                        else {
                        	
                            System.out.println("no"); 
                        }
                    	
                    }
                
                
            }
        }
        catch (Exception e) {
            System.out.println("no");
        }

    }

}
