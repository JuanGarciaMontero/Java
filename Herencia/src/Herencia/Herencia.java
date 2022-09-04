package Herencia;

//http://puntocomnoesunlenguaje.blogspot.com/2014/07/herencia-en-java.html

//Clase Persona. La clase Persona es la Superclase

 class Persona {
  private String nif;
  private String nombre;
  public String getNif() {
      return nif;
  }
  public void setNif(String nif) {                                                                              
      this.nif = nif;
  }
  public String getNombre() {
      return nombre;
  }
  public void setNombre(String nombre) {                                                                        
      this.nombre = nombre;
  }
  public Persona(String nif, String nombre) {
	  
	  this.nif = nif;
	  this.nombre = nombre;
	  
  }
  
}
 class Herencia extends Persona {


		private String curso;
	    public String getCurso() {
	        return curso;
	    }
	    public void setCurso(String curso) {                                                                          
	        this.curso = curso;                                                                                       
	    } 
	    
	    public Herencia (String nif, String nombre, String curso) {
	    	
	    	super (nif,nombre);
	    	
	    	this.curso = curso;
	    	}
	    
	

public static void main(String[] args) {
	// TODO Apéndice de método generado automáticamente
	
	Herencia x = new Herencia("56004455-Q","Fernando Alonso","1 DAW Online");

	System.out.println("Nif:"+x.getNif()+" , Nombre:"+x.getNombre()+" , Curso:"+x.getCurso());
	
	}
}