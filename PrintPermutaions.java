/******************************************************************************
    "ABC" is the sting and we have to find all posible Permutaion by sung backtracking
*******************************************************************************/

public class Main
{
    public static void PrintPermutaions(String str,String Permutaion , int Index){
        if(str.length()==0){
            System.out.println(Permutaion);
            return;
        }
        //loop for index i to new sting and to add CurrentChar at Permutaion    
        for(int i=0;i<str.length();i++){
            char CurrentChar = str.charAt(i);
            String NewString = str.substring(0,i) + str.substring(i+1);
            //recusion
            PrintPermutaions(NewString,Permutaion+CurrentChar,Index+1);
        }
    }
	public static void main(String[] args) {
		String str = "ABC";
		System.out.println("possible permutions fot the sting "+str+" is: " );
		PrintPermutaions(str,"",0);
	}
 }//possible permutions fot the sting ABC is: 
// ABC
// ACB
// BAC
// BCA
// CAB
// CBA

