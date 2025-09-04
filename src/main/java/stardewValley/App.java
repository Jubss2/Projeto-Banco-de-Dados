package stardewValley;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		Player p1 = new Player();
	
		Fish f1s = new Fish();		
		Fish f2s = new Fish();
		Fish f1w = new Fish();		
		Fish f2w = new Fish();
		Festival fe1s = new Festival();
		Festival fe2s = new Festival();
		Festival fe1f = new Festival();
		Festival fe2f = new Festival();
		Festival fe1w = new Festival();
		Festival fe2w = new Festival();
		Festival fe3w = new Festival();
		//Winter wi = new Winter();
		Fish f1f = new Fish();		
		Fish f2f = new Fish();	
		WateringCan w = new WateringCan();
		w.setMaterial(MaterialEnum.STARTER);
		Pickaxe p = new Pickaxe();
		p.setMaterial(MaterialEnum.STARTER);
		Axe a = new Axe();
		a.setMaterial(MaterialEnum.STARTER);
		Hoe h = new Hoe();
		h.setMaterial(MaterialEnum.STARTER);
		FishingPole fp = new FishingPole();
		fp.setMaterial(MaterialEnum.STARTER);
		Villager v1 = new Villager();
		Villager v2 = new Villager();
		Villager v3 = new Villager();
		
		f1s.setName("Pufferfish");
		f1s.setLocation(LocationEnum.OCEAN);
		f2s.setName("Tune");
		f2s.setLocation(LocationEnum.OCEAN);
		f1f.setName("Ms. Angler");
		f1f.setLocation(LocationEnum.RIVER);
		f2f.setName("Tilapia");
		f2f.setLocation(LocationEnum.OCEAN);
		f1w.setName("Esturjão");
		f1w.setLocation(LocationEnum.LAKE);
		f2w.setName("Albacora");
		f2w.setLocation(LocationEnum.OCEAN);
		fe2s.setEvent("Luau");
		fe1s.setEvent("Dança das Medusas da Lua");
		fe1f.setEvent("Feira do Vale do Orvalho");
		fe2f.setEvent("Véspera dos Espíritos");
		fe1w.setEvent("Festival do Gelo");
		fe2w.setEvent("Mercado Noturno");
		fe3w.setEvent("Festival da Estrela Invernal");
		
		p1.getFamiliarVillagers().add(v1);
		p1.getFamiliarVillagers().add(v2);
		v1.setName("Sebastian");
		v1.setHearts(0);
		v2.setName("Leah");
		v2.setHearts(4);

		
		p1.getToolsPlayer().add(w);
		p1.getToolsPlayer().add(p);
		p1.getToolsPlayer().add(fp);
		p1.getToolsPlayer().add(h);
		p1.getToolsPlayer().add(a);
		
		v1.getMarriageCandidates().add(v1);
		v1.getMarriageCandidates().add(v2);
		
		
		System.out.println("Coloque um nome para o fazendeiro:"); 
		String name = sc.nextLine();
		p1.setName(name);
		System.out.println("Coloque um nome para sua fazenda: ");
		String nameF = sc.nextLine();
		p1.setFarmName(nameF);
		

		w.setMaterial(MaterialEnum.COOPER);
		a.setMaterial(MaterialEnum.COOPER);
		v1.setHearts(10);
		v3.setName("Lewis");
		p1.getFamiliarVillagers().add(v3);
		v3.setHearts(1);
			
		//wi.getFishes().add(f1w);
		//wi.getFishes().add(f2w);
		//w.setMaterial(MaterialEnum.STEEL);
		//wi.getFestivals().add(fe2w);
		//wi.getFestivals().add(fe1w);
		//wi.getFestivals().add(fe3w);
		v3.setHearts(4);
		v1.setHearts(12);
		
	}

}
