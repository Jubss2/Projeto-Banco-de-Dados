package stardewValley;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppInsert {

	public static void main(String[] args) {
		 EntityManagerFactory emf
         = Persistence.createEntityManagerFactory("stardewPU");
		 EntityManager em = emf.createEntityManager();
		 em.getTransaction().begin();
		 
		Player p1 = new Player();
		Player p2 = new Player();
		
		Fish f1s = new Fish();
		f1s.setName("Pufferfish");
		f1s.setLocation(LocationEnum.OCEAN);
		f1s.setSeason(SeasonEnum.SUMMER);
		em.persist(f1s);
		Fish f2f = new Fish();
		f2f.setName("Tilapia");
		f2f.setLocation(LocationEnum.OCEAN);
		f2f.setSeason(SeasonEnum.FALL);
		em.persist(f2f);
		Fish f1w = new Fish();
		f1w.setName("Esturjão");
		f1w.setLocation(LocationEnum.LAKE);
		f1w.setSeason(SeasonEnum.WINTER);
		em.persist(f1w);
		
		Festival fe1s = new Festival();
		fe1s.setEvent("Dança das Medusas da Lua");
		fe1s.setSeason(SeasonEnum.SUMMER);
		em.persist(fe1s);
		
		Festival fe1f = new Festival();
		fe1f.setEvent("Feira do Vale do Orvalho");
		fe1f.setSeason(SeasonEnum.FALL);
		em.persist(fe1f);
		
		Festival fe1w = new Festival();
		fe1w.setEvent("Festival do Gelo");
		fe1w.setSeason(SeasonEnum.WINTER);
		em.persist(fe1w);
		
		Plant couve = new Plant();
		couve.setName("Couve-flor");
		couve.setDaysToHarvest(12);
		couve.setPriceToBuy(40);
		couve.setPriceToSell(250);
		couve.setSeason(SeasonEnum.SPRING);
		em.persist(couve);
		
		Plant melao = new Plant();
		melao.setName("Melão");
		melao.setDaysToHarvest(12);
		melao.setPriceToBuy(40);
		melao.setPriceToSell(200);
		melao.setSeason(SeasonEnum.SUMMER);
		em.persist(melao);
		
		Itens fb = new Itens();
		fb.setName("Fertilizante Basico");
		fb.setCost(100);
		em.persist(fb);
		
		Itens fe = new Itens();
		fe.setName("Feno");
		fe.setCost(50);
		em.persist(fe);
		
		WateringCan w = new WateringCan();
		w.setMaterial(MaterialEnum.STARTER);
		w.setName("Regador");
		em.persist(w);
		Pickaxe p = new Pickaxe();
		p.setMaterial(MaterialEnum.STARTER);
		p.setName("Picareta");
		em.persist(p);
		Axe a = new Axe();
		a.setMaterial(MaterialEnum.STARTER);
		a.setName("Machado");
		em.persist(a);
		Hoe h = new Hoe();
		h.setMaterial(MaterialEnum.STARTER);
		h.setName("Enxadas");
		em.persist(h);
		FishingPole fp = new FishingPole();
		fp.setMaterial(MaterialEnum.STARTER);
		fp.setName("Vara de pesca");
		em.persist(fp);
		
		Villager v1 = new Villager();
		v1.setName("Sebastian");
		v1.configHearts(0);
		em.persist(v1);	
		
		Villager v2 = new Villager();
		v2.setName("Leah");
		v2.configHearts(4);
		em.persist(v2);
		
		Villager v3 = new Villager();
		v3.setName("Pierre");
		v3.configHearts(1);
		em.persist(v3);

		Villager v4 = new Villager();
		v4.setName("Marnie");
		v4.configHearts(4);
		em.persist(v4);
		
		Store ps = new Store();
		ps.setName("Armazém do Pierre");
		ps.setOwner(v3);
		ps.setTimeCloses(17);
		ps.setTimeOpens(9);
		ps.getItensStore().add(fb);
		em.persist(ps);
		
		Store rm = new Store();
		rm.setName("Rancho da Marnie");
		rm.setOwner(v4);
		rm.setTimeCloses(16);
		rm.setTimeOpens(9);
		rm.getItensStore().add(fe);
		em.persist(rm);
		
		Domestic cat = new Domestic();
		cat.setName("Tigre");
		cat.setPutWaterInBool(true);
		cat.setHearts(4);
		em.persist(cat);
		
		FarmAnimal cow = new FarmAnimal();
		cow.setName("Gestrudes");
		cow.setHearts(3);
		cow.setIsProducing(false);
		cow.setMood(10);
		em.persist(cow);
		
		FarmAnimal chi = new FarmAnimal();
		chi.setName("Nabo");
		chi.setHearts(5);
		chi.setIsProducing(true);
		chi.setMood(80);
		em.persist(chi);
		
		p1.setName("Julia");
		p1.setFarmName("Goiabada");
		
		p1.getFamiliarVillagers().add(v1);
		p1.getFamiliarVillagers().add(v2);
		p1.getFamiliarVillagers().add(v3);
		p1.getToolsPlayer().add(a);
		p1.setPet(cat);
		em.persist(p1);
		
		p2.setName("Pedro");
		p2.setFarmName("Queijo");
		
		p2.getToolsPlayer().add(p);
		p2.getAnimalsPlayer().add(chi);
		p2.getAnimalsPlayer().add(cow);
		em.persist(p2);
		
		em.getTransaction().commit();
        em.close();
        emf.close();
	}

}
