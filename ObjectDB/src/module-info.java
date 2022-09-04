module ObjectDB {
	
	
	
	
	
	em.getTransaction().begin();
	Trabajador trabajador = new Trabajador(“Shakira”, “Rodríguez”);
	em.persist(trabajador);
	em.getTransaction().commit()
	
	
	
	
	
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	Directorio d1=new Directorio(“Augusto”,”Galicia”);
	Directorio d2=new Directorio(“José”,”Madrid”);
	em.persist(d1);
	em.persist(d2);
	em.getTransaction().commit();
	TypedQuery< Directorio > query
	      = em.createQuery(“SELECT d FROM Directorio d”,Directorio.class);
	      List< Directorio > results = query.getResultList();
	      for (Directorio dd : results) {
	         System.out.println(dd);
	      }
	      em.close();
	      emf.close();
	
	
}