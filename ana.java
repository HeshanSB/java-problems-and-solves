/* Two strings a and b are called anagrams if they contain all the same characters
 in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA,
 ATC, and CTA.
Complete the function in the editor. If a and b are case-insensitive anagrams,
 print "Anagrams"; otherwise, print "Not Anagrams" instead. */
class ana{
	public void print(String a, String b){
		int[] aLetters = new int[27];
        int[] bLetters = new int[27];
        String[] aArray = a.split("");
        String[] bArray = b.split("");
        int ascii;
        int i,j;
        if(aArray.length==bArray.length){
            for(i=0; i<aArray.length; i++){
                ascii=(int)aArray[i].charAt(0);
                if(ascii>96){
                    aLetters[ascii-97] = aLetters[ascii-97]+1;
                }
                else{
                    aLetters[ascii-65] = aLetters[ascii-65]+1;
                }
            }
            for(j=0; j<bArray.length; j++){
                ascii=(int)bArray[j].charAt(0);
                if(ascii>96){
                    bLetters[ascii-97] = bLetters[ascii-97]+1;
                }
                else{
                    bLetters[ascii-65] = bLetters[ascii-65]+1;
                }
            }
            int k=0;
            while(k<aLetters.length && aLetters[k]==bLetters[k]){
                k++;
            }
            if(k==aLetters.length){
				System.out.println("anagram");
            }
            else{
				System.out.println("not anagram");
            }
        }
        else{
			System.out.println("not anagram");
        }
	}
	public static void main(String args[]){
		ana an = new ana();
		an.print("heyhAn", "HezHAN");
	}
}
