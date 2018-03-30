package fatec.poo.utils;

/**
 *
 * @authors Felipe e Thiago e Marcos
 */

public class ValidaCpf {
    
    public static String removeMask(String cpf) {
        return cpf.replaceAll("[^0-9]", "");
    }
    
    @SuppressWarnings("empty-statement")
    public static boolean isCpf(String cpf) { 		
        cpf = removeMask(cpf);
        
        int i;
	for(i = 1; i < cpf.length() && cpf.charAt(i) == cpf.charAt(i-1); i++);
        
        if(cpf.length() != 11 || i == cpf.length()){
            return false;
        }
      
        int sum = 0; 
        int resto; 

        i = 0;
        while(i < 9) { 
            sum += Character.getNumericValue(cpf.charAt(i++)) * i; 
        } 

        resto = (sum + 11) % 11; 

        if(resto == 10){
            resto = 0;
        }
            
        if(resto != Character.getNumericValue(cpf.charAt(9))){
            return false;
        }else{
            sum = 0; 
            int j;
            
            i = 0; j = 11;
            while(i < 10) { 
                sum += Character.getNumericValue(cpf.charAt(i++)) * j--; 
            } 
             
            resto = (sum * 10) % 11; 

            if(resto == 10){
                resto = 0;
            }
            
            return (resto == Character.getNumericValue(cpf.charAt(10)));
        }
    } 
    
    public static String imprimeCPF(String CPF) { 
        return(CPF.substring(0, 3) + "." + 
               CPF.substring(3, 6) + "." + 
               CPF.substring(6, 9) + "-" + 
               CPF.substring(9, 11)); 
    
    }    
}
