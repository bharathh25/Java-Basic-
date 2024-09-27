class SpeakerEtcRunner{
	
	public static void main(String[] args){
		
		Speaker speaker = new Speaker('S');
		speaker.setCost(790);
		speaker.speakerOutput("Average");
		speaker.SpeakerDisplay();
		
		System.out.println("-------------------------");
		
		Speaker speaker1 = new Speaker('M');
		speaker1.setCost(1689);
		speaker1.speakerOutput("Good");
		speaker1.SpeakerDisplay();
		
		System.out.println("-------------------------");

		Speaker speaker2 = new Speaker('L');
		speaker2.setCost(2593);
		speaker2.speakerOutput("Very Good");
		speaker2.SpeakerDisplay();
		
		System.out.println("-------------------------");

		System.out.println("=========================");
		
		Rocket rocket = new Rocket(12200);
		rocket.setFuelCapacity(250);
		rocket.thrusters(3);
		rocket.RocketDisplay();
		
		System.out.println("-------------------------");
		
		Rocket rocket1 = new Rocket(15500);
		rocket1.setFuelCapacity(280);
		rocket1.thrusters(4);
		rocket1.RocketDisplay()
		;
		System.out.println("-------------------------");

		Rocket rocket2 = new Rocket(16200);
		rocket2.setFuelCapacity(350);
		rocket2.thrusters(5);
		rocket2.RocketDisplay();
		
		System.out.println("-------------------------");
		
		System.out.println("=========================");
		
		Chocolate chocolate = new Chocolate(180);
		chocolate.setFlavour("Oreo");
		chocolate.ChocolateSize('L');
		chocolate.ChocolateDisplay();
		
		System.out.println("-------------------------");

		Chocolate chocolate2 = new Chocolate(45);
		chocolate2.setFlavour("Crackle");
		chocolate2.ChocolateSize('S');
		chocolate2.ChocolateDisplay();

		System.out.println("-------------------------");
		
		Chocolate chocolate3 = new Chocolate(80);
		chocolate3.setFlavour("Mousse");
		chocolate3.ChocolateSize('M');
		chocolate3.ChocolateDisplay();
		
		System.out.println("-------------------------");
		
		System.out.println("=========================");
		
		Projector projector = new Projector("EPSON");
		projector.setColor("White");
		projector.ProjectorWeight(2.75);
		projector.ProjectorDisplay();
		
		System.out.println("-------------------------");

		Projector projector1 = new Projector("SONY");
		projector1.setColor("Black");
		projector1.ProjectorWeight(3.37);
		projector1.ProjectorDisplay();
		
		System.out.println("-------------------------");
		
		Projector projector2 = new Projector("SONY");
		projector2.setColor("White");
		projector2.ProjectorWeight(3.65);
		projector2.ProjectorDisplay();
		
		System.out.println("-------------------------");

		System.out.println("=========================");
		
		Paper paper = new Paper(120);
		paper.setQuality("Average");
		paper.ProjectorColor("White");
		paper.PaperDisplay();
		
		System.out.println("-------------------------");

		Paper paper1 = new Paper(114);
		paper1.setQuality("Good");
		paper1.ProjectorColor("Red");
		paper1.PaperDisplay();
		
		System.out.println("-------------------------");
		
		Paper paper2 = new Paper(135);
		paper2.setQuality("Very Good");
		paper2.ProjectorColor("White");
		paper2.PaperDisplay();
		
		System.out.println("-------------------------");

		
		System.out.println("=========================");
		
	}
}