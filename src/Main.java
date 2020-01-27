import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void intro() throws InterruptedException {
		//picks name, class, and chooses the start location
		//only a one time function
		int charClass = 0;
		boolean checker = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to province of High Rock on the continent of Tamriel!");
		Thread.sleep(1000);
		System.out.println("This is the land of Bretons, huge cities, and towering mountains!");
		Thread.sleep(1000);
		System.out.println("Write your name");
		
		name = input.nextLine();
		
		System.out.println("Pick a class");
		Thread.sleep(1000);
		System.out.println("1. Fighter: All-Around");
		Thread.sleep(200);
		System.out.println("2. Brute: High Health, Low Attack");
		Thread.sleep(200);
		System.out.println("3. Thief: Low Health, High Attack");
		

		while (checker) {
			charClass = input.nextInt();
			
			if (charClass == 1) {
				character=1;
				health = 65;
				maxhealth=65;
				attack = 25;
				checker= false;
			}
			
			else if (charClass == 2) {
				character=2;
				health = 80;
				attack = 10;
				maxhealth=80;
				checker= false;
			}
			
			else if (charClass == 3) {
				character=3;
				health = 40;
				attack = 50;
				
				maxhealth=40;
				checker= false;
			}
			
			else {
				System.out.println("Please choose one of the previous classes");
			}
			
		}

	}
	
	public static void daggerfall() throws InterruptedException{
		//Daggerfall city locations listing
		
		Thread.sleep(1000);
		System.out.println("Level: " + level);
		Thread.sleep(200);
		System.out.println("Health: " + health + "/" + maxhealth);
		Thread.sleep(200);
		System.out.println("Attack: " + attack);
		Thread.sleep(200);
		System.out.println("XP: " + xp + "/" + xptolevel);
		System.out.println("Pick which part of Daggerfall you would like to visit.");
		Thread.sleep(500);
		System.out.println("1. Mages Guild of High Rock");
		Thread.sleep(200);
		System.out.println("2. The Ratways");
		Thread.sleep(200);
		System.out.println("3. Drow's Home");
		Thread.sleep(200);
		System.out.println("4. Kjar's Homestead");
		Thread.sleep(200);
		System.out.println("5. Helseth's Shack");
		Thread.sleep(200);
		System.out.println("6. Watch Tower (fight monsters here)");
		Thread.sleep(200);
		System.out.println("7. Leave city");
		choosingDaggerfall();
		
	}
	
	public static void camlorn() throws InterruptedException{
		
		Thread.sleep(1000);
		System.out.println("Level: " + level);
		Thread.sleep(200);
		System.out.println("Health: " + health + "/" + maxhealth);
		Thread.sleep(200);
		System.out.println("Attack: " + attack);
		Thread.sleep(200);
		System.out.println("XP: " + xp + "/" + xptolevel);
		System.out.println("Pick which part of Camlorn you would like to visit.");
		Thread.sleep(500);
		System.out.println("1. Military of High Rock");
		Thread.sleep(200);
		System.out.println("2. Bilbo's Home");
		Thread.sleep(200);
		System.out.println("3. Karstund Keep (fight monsters here)");
		Thread.sleep(200);
		System.out.println("4. Leave city");
		Thread.sleep(200);
		choosingCamlorn();
		
	}
	
	public static void wayrest() throws InterruptedException{
		
		Thread.sleep(1000);
		System.out.println("Level: " + level);
		Thread.sleep(200);
		System.out.println("Health: " + health + "/" + maxhealth);
		Thread.sleep(200);
		System.out.println("Attack: " + attack);
		Thread.sleep(200);
		System.out.println("XP: " + xp + "/" + xptolevel);
		System.out.println("Pick which part of Wayrest you would like to visit.");
		Thread.sleep(500);
		System.out.println("1. Docks");
		Thread.sleep(200);
		System.out.println("2. Tom's Home");
		Thread.sleep(200);
		System.out.println("3. Yrstad Tomb (fight monsters here");
		Thread.sleep(200);
		System.out.println("4. Leave city");
		choosingWayrest();
		
	}
	public static void choosingWayrest() throws InterruptedException{
		//code for picking a location in the city
		int wayrestChoice = 0;
		Scanner input = new Scanner(System.in);
		while (wayrestChoice != 1 ||wayrestChoice != 2 || wayrestChoice != 3 || wayrestChoice != 4) {
			
			wayrestChoice = input.nextInt();
			if (wayrestChoice == 1) {
				Thread.sleep(1000);
				System.out.println("The docks have nothing much to offer as today seemed too busy for any sort of trip or talk. You walk back.");
				wayrest();
				
			}
			
			else if (wayrestChoice == 2) {
				Thread.sleep(1000);
				unwelcomeWayrest();
				
			}
			
			else if (wayrestChoice == 3) {
				Thread.sleep(1000);
				System.out.println("The keep is said to be abandoned by its owners years ago. It is known for monsters.");
				tower();
				
			}
			
			else if (wayrestChoice == 4) {
				Thread.sleep(1000);
				System.out.println("You leave for another city.");
				choosingCity();
				
			}
			
			else {
				System.out.print("Please choose one of the previously mentioned choices.");
			}
			
		}
		
	}
	public static void choosingCamlorn() throws InterruptedException{
		//code for picking a location in the city
		int wayrestChoice = 0;
		Scanner input = new Scanner(System.in);
		while (wayrestChoice != 1 ||wayrestChoice != 2 || wayrestChoice != 3 || wayrestChoice != 4) {
			wayrestChoice = input.nextInt();
			if (wayrestChoice == 1) {
				Thread.sleep(1000);
				System.out.println("The guard blocks you off from entering");
				camlorn();

			}
			else if (wayrestChoice == 2) {
				Thread.sleep(1000);
				unwelcomeCamlorn();
			}
			else if (wayrestChoice == 3) {
				Thread.sleep(1000);
				System.out.println("The tomb is said to house the old emperor of Tamriel.The place is known for monsters.");
				
				tower();
			}
			else if (wayrestChoice == 4) {
				Thread.sleep(1000);
				System.out.println("You leave for another city.");
				choosingCity();
			}
			else {
				System.out.print("Please choose one of the previously mentioned choices.");
			}
			
		}
		
	}
	
	public static void ratways() throws InterruptedException{
		Thread.sleep(1000);
		Scanner input = new Scanner(System.in);
		System.out.println("Unsettling chills run down your back.");
		if (bosscheck==false) {
			Thread.sleep(1000);
			System.out.println("A ghostly voice says to you, \"Read the book...\"");
			Thread.sleep(1000);
			System.out.println("You pass out and find yourself back on the streets.");
			Thread.sleep(1000);
			System.out.println("You assume the book is in the Mage's Guild.");
			daggerfall();
		}
		else if (bosscheck == true) {
			int leave = 0;
			Thread.sleep(200);
			System.out.println("Out of the darkness, a huge skeletal figure wearing a crown appears.");
			Thread.sleep(1000);
			System.out.println("It is the old-king of Daggerfall, coming to kill you. You must end the undead being.");
			Thread.sleep(1000);
			System.out.println("Do you wish to leave to safety before it is too late?");
			Thread.sleep(200);
			System.out.println("1. Leave");
			Thread.sleep(200);
			System.out.println("2. Continue the fight");
    		while (leave != 1 || leave != 2) {
    			leave=input.nextInt();
    			if (leave ==1 ) {
    				Thread.sleep(200);
    				System.out.println("You quickly leave the old sewer and find shelter.");
    				daggerfall();
    			}
    			else if (leave ==2) {
    				Thread.sleep(200);
    				System.out.println("You pull out your sword and prepare for a long fight.");
    				bossBattle();

    			}
    			else {
    				System.out.println("Choose one of the previously mentioned choices");
    			}
    		}
		}
	}
	public static void bossBattle() throws InterruptedException{
		Scanner input = new Scanner(System.in);
		int bosshealth = 300*level;
		int bossattack = 15*level;
		System.out.println("Level: " + level);
		Thread.sleep(200);
		System.out.println("Health: " + health + "/" + maxhealth);
		Thread.sleep(200);
		System.out.println("Attack: " + attack);
		Thread.sleep(200);
		System.out.println("XP: " + xp + "/" + xptolevel);
		if (health <=0) {
			dead();
		}
		while(health >0 ){
            int damage= 15*level;
            int attackChoice;
            int newAttack;
            System.out.println(name + ": " + health);
            System.out.println("Lichking: " + bosshealth);
            Thread.sleep(200);
            System.out.println("What do you do?");
            Thread.sleep(200);
            System.out.println("1. Standard Attack");
            Thread.sleep(200);
            System.out.println("2. Block");
            newAttack=attack+ generator.nextInt(5*level);
            attackChoice = input.nextInt();
            if (attackChoice ==1) {

                System.out.println(name + " hits the Lichking for " + newAttack);   
                Thread.sleep(200);
                System.out.println("The Lichking shrieks and slashes you with a huge rusty sword");
                Thread.sleep(200);
                System.out.println("The Lichking" + " hits " + name + " for " + damage);
                health-=damage;
                bosshealth -= newAttack;
        		if (health <=0) {
        			dead();
        		}
        		if (bosshealth<=0) {
        			Thread.sleep(200);
        			victory();
        		}
            }
            else if (attackChoice == 2) {

            	System.out.println("The Lichking shrieks and slashes you with a huge rusty sword");
            	Thread.sleep(200);
            	System.out.println("The Lichking" + " hits " + name + " for " + damage);
            	Thread.sleep(200);
            	System.out.println("You shield the attack");


            }
            else {
            	System.out.println("That is not a choice!");
            	Thread.sleep(200);
            	System.out.println("The Lichking shrieks and slashes you with a huge rusty sword");
            	Thread.sleep(200);
            	System.out.println("The Lichking" + " hits " + name + " for " + damage);
            	health-=damage;
        		if (health <=0) {
        			dead();
        		}

            }

		}
		
	}
	
	public static void unwelcomeDaggerfall() throws InterruptedException{
		//unfriendly home owner responses
		System.out.println("Get out, you don't live here you fool says a man.");
		Thread.sleep(1000);
		System.out.println("You walk away waving goodbye as the owner slams the door on you");
		daggerfall();
	}
	
	public static void unwelcomeWayrest() throws InterruptedException{
		//unfriendly home owner responses
		System.out.println("Get out, you don't live here you fool says a man.");
		Thread.sleep(1000);
		System.out.println("You walk away waving goodbye as the owner slams the door on you");
		wayrest();
	}
	
	public static void unwelcomeCamlorn() throws InterruptedException{
		//unfriendly home owner responses
		System.out.println("Get out, you don't live here you fool says a man.");
		Thread.sleep(1000);
		System.out.println("You walk away waving goodbye as the owner slams the door on you");
		camlorn();
	}
	
	public static void victory()throws InterruptedException{
		victory=true;
		Thread.sleep(1000);
		System.out.println("The Lichking lays dead in front of you.");
		Thread.sleep(1000);
		System.out.println("The surrounding populace watches you in awe");
		Thread.sleep(1000);
		System.out.println("Soon, you became known as the hero of Daggerfall");
		Thread.sleep(1000);
		System.out.println("You win the the game!");
		System.exit(0);
	}
	
	public static void choosingDaggerfall() throws InterruptedException{
		//code for picking a location in the city
		int daggerfallChoice = 0;
		Scanner input = new Scanner(System.in);
		while (daggerfallChoice != 1 || daggerfallChoice != 2 || daggerfallChoice != 3 || daggerfallChoice != 4 || daggerfallChoice != 5 || daggerfallChoice != 6) {
			daggerfallChoice = input.nextInt();
			if (daggerfallChoice == 1) {
				magesGuild();

			}
			
			else if (daggerfallChoice == 2) {
				Thread.sleep(1000);
				System.out.println("You slowly walk into the Ratways. The location was clearly neglected as there was barely any solid paths.");
				System.out.println("You see something in the darkness");
				ratways();
			}
			
			else if (daggerfallChoice == 3) {
				Thread.sleep(1000);
				unwelcomeDaggerfall();
			}
			
			else if (daggerfallChoice == 4) {
				Thread.sleep(1000);
				unwelcomeDaggerfall();
			}
			
			else if (daggerfallChoice == 5) {
				Thread.sleep(1000);
				unwelcomeDaggerfall();
			}
			
			else if (daggerfallChoice == 6) {
				Thread.sleep(1000);
				System.out.println("You enter an old tower that is known to be filled with monsters.");
				tower();
			}
			
			else if (daggerfallChoice == 7) {
				Thread.sleep(1000);
				System.out.println("You leave for another city.");
				choosingCity();
			}
			
			else {
				System.out.print("Please choose one of the previously mentioned choices.");
			}
			
		}
		
	}
	
	public static void magesGuild() throws InterruptedException{
		//Listings for things to do in the mages guild
		Thread.sleep(400);
		System.out.println("Here you can read books and learn about the city.");
		Thread.sleep(1000);
		System.out.println("Pick what you want to do in the Mages Guild.");
		Thread.sleep(1000);
		System.out.println("1. Read \"War of Betony\"");
		Thread.sleep(200);
		System.out.println("2. Read \"Legend of Daggerfall\"");
		Thread.sleep(200);
		System.out.println("3. Heal from Mage (requires 20 XP)");
		Thread.sleep(200);
		System.out.println("4. Leave");
		choosingMage();
	}
	public static void choosingMage() throws InterruptedException{
		//code for the responses for each option in the list
		int mageChoice = 0;
		Scanner input = new Scanner(System.in);
		while (mageChoice != 1 || mageChoice != 2 || mageChoice != 3 || mageChoice != 4) {
			mageChoice = input.nextInt();
			if (mageChoice == 1) {
				Thread.sleep(1000);
				System.out.println("The book read about how the city of Daggerfall had a stunning military victory against a huge city-state known as Sentinel located in another province.");
				magesGuild();

			}
			else if (mageChoice == 2) {
				Thread.sleep(1000);
				System.out.println("The book spoke about a long dead king who was killed unjustly on the field of battle.");
				Thread.sleep(1000);
				System.out.println("His body is said to roam the Ratways of Daggerfall, killing any who enters.");
				Thread.sleep(1000);
				bosscheck = true;
				magesGuild();

			}
			else if (mageChoice == 3) {
				Thread.sleep(1000);
				if (xp < 20) {
					System.out.println("You do not have enough XP for a heal spell.");
					Thread.sleep(1000);
					magesGuild();
				}
				else {
					System.out.println("The mage places a heal spell over you.");
					health=maxhealth;
					xp-=20;
					System.out.println("Level: " + level);
					Thread.sleep(200);
					System.out.println("Health: " + health + "/" + maxhealth);
					Thread.sleep(200);
					System.out.println("Attack: " + attack);
					Thread.sleep(200);
					System.out.println("XP: " + xp + "/" + xptolevel);
					magesGuild();
				}

			}
			else if (mageChoice == 4) {
				Thread.sleep(1000);
				System.out.println("You exit the guildhall");
				daggerfall();

			}
			else {
				System.out.print("Please choose one of the previously mentioned choices.");
			}
		}	
	}
	public static void tower() throws InterruptedException {
		//long code for combat
		Scanner input = new Scanner(System.in);
		monster = nameList[generator.nextInt(nameList.length)];
		Thread.sleep(1000);
		System.out.println("Level: " + level);
		Thread.sleep(200);
		System.out.println("Health: " + health + "/" + maxhealth);
		Thread.sleep(200);
		System.out.println("Attack: " + attack);
		Thread.sleep(200);
		System.out.println("XP: " + xp + "/" + xptolevel);
		int leave = 0;
		int attackChoice;
		int damage;
		int healthAt;
		int xpgain;
		int newAttack;
		int count = 0;
		Thread.sleep(1000);
		System.out.println("Suddenly, monsters begin to surround you. You ready your blade.");
		Thread.sleep(400);
		healthAt=(generator.nextInt(25)+10)*level;
		possible = (generator.nextInt(10)+1);
        newAttack=attack+ generator.nextInt(5*level);
        xpgain=(generator.nextInt(20)+10)*level;
		if (health <=0) {
			dead();
		}

		while (health > 0) {
			Thread.sleep(400);
			
			System.out.println("A " + monster + " approaches.");
			Thread.sleep(400);
			System.out.println(monster+ " Health: "+ healthAt);
			System.out.println(name + "'s Health: "+ health);
			Thread.sleep(400);
			System.out.println("What do you do?");
			Thread.sleep(200);
			System.out.println("1. Standard Attack");
			Thread.sleep(200);
            System.out.println("2. Block");
            if ((xptolevel-xp)<30) {
            	Thread.sleep(200);
                System.out.println("3. Special Attack");
            }
            attackChoice = input.nextInt();
            if (attackChoice ==1) {
                damage = (generator.nextInt(10)+10)*level;
                System.out.println(name + " hits the " + monster + " for " + newAttack);          
                System.out.println("The " + monster + " hits " + name + " for " + damage);
            	health-=damage;
            	healthAt-=newAttack;
            	if (healthAt <=0) {
        			if (health <=0) {
        				dead();
        			}
            		xp +=xpgain;
            		if (xp >= xptolevel) {
            			level += 1;
            			xpadder= xp-xptolevel;
            			xp=0;
            			xp+=xpadder;
            			xpadder=0;
            			xptolevel*=level;
            			xptolevel+=50;
            			health = level*5+health;
            			attack = level*5+attack;
            			maxhealth +=30;
            			health=maxhealth;
            			System.out.println("****  L E V E L   U P ****");
            		}
            		Thread.sleep(1000);
        			System.out.println(name + "'s Health: "+ health);
            		System.out.println("You have gained " + xpgain + " XP!");
            		System.out.println("XP: " + xp + "/" + xptolevel);
            		Thread.sleep(1000);
            		System.out.println("Do you wish to continue clearing the building or do you wish to leave?");
            		Thread.sleep(200);
            		System.out.println("1. Leave");
            		Thread.sleep(200);
            		System.out.println("2. Continue");
            		while (leave != 1 || leave != 2) {
            			leave=input.nextInt();
            			
            			if (leave ==1 ) {
            				Thread.sleep(200);
            				
            				System.out.println("You quickly leave the building and shut the door.");
            				if (location == 1) {
            					daggerfall();
            				}
            				
            				else if (location == 2) {
            					camlorn();
            				}
            				
            				else if (location == 3) {
            					wayrest();
            				}
            				
            			}
            			else if (leave ==2) {
            				Thread.sleep(200);
            				System.out.println("You run up the stairs to further clear the tower");
            				healthAt=(generator.nextInt(25)+10)*level;
            		        newAttack=attack+ generator.nextInt(5*level);
            		        xpgain=(generator.nextInt(20)+10)*level;
            				tower();
            			}
            			else {
            				System.out.println("Choose one of the previously mentioned choices");
            			}
            		}
            	}
            }
            
            else if (attackChoice == 2) {
            	
            	damage = generator.nextInt(5)+1;            
            	System.out.println("The "+monster+" hits " + name + " for " + damage);
                System.out.println("You shield the attack");
                count +=1;
                if (count == possible) {
                	System.out.println("Over time, the enemy wears out and wanders off. You now have a chance to leave.");
                	Thread.sleep(200);
                	System.out.println("Do you wish to leave?");
                	Thread.sleep(200);
            		System.out.println("1. Leave");
            		Thread.sleep(200);
            		System.out.println("2. Continue");
            		while (leave != 1 || leave != 2) {
            			leave=input.nextInt();
            			if (leave ==1 ) {
            				Thread.sleep(200);
            				System.out.println("You quickly leave the building and shut the door.");
            				if (location == 1) {
            					daggerfall();
            				}
            				else if (location == 2) {
            					camlorn();
            				}
            				else if (location == 3) {
            					wayrest();
            				}
            				
            			}
            			else if (leave ==2) {
            				Thread.sleep(200);
            				System.out.println("You run up the stairs to further clear the tower");
            				healthAt=(generator.nextInt(25)+10)*level;
            		        newAttack=attack+ generator.nextInt(5*level);
            		        xpgain=(generator.nextInt(20)+10)*level;
            				tower();
            			}
            			else {
            				System.out.println("Choose one of the previously mentioned choices");
            			}
            		}
                }
            }
            else if (attackChoice ==3) {
            	if ((xptolevel-xp)<30) {
            		if (character ==1) {
            			Thread.sleep(200);
            			System.out.println("You take your sword and charge it with a fire brand spell and slash the enemy for tons of damage");
            			System.out.println(name + " hits the " + monster + " for 300");  
            			healthAt-=300;
                    	if (healthAt <=0) {
                    		xp +=xpgain;
                    		if (xp >= xptolevel) {
                    			level += 1;
                    			xpadder= xp-xptolevel;
                    			xp=0;
                    			xp+=xpadder;
                    			xpadder=0;
                    			xptolevel*=level;
                    			xptolevel+=50;
                    			health = level*5+health;
                    			attack = level*5+attack;
                    			maxhealth +=30;
                    			health=maxhealth;
                    			System.out.println("****  L E V E L   U P ****");
                    		}
                    		Thread.sleep(1000);
                			System.out.println(name + "'s Health: "+ health);
                    		System.out.println("You have gained " + xpgain + " XP!");
                    		System.out.println("XP: " + xp + "/" + xptolevel);
                    		Thread.sleep(1000);
                    		System.out.println("Do you wish to continue clearing the building or do you wish to leave?");
                    		Thread.sleep(200);
                    		System.out.println("1. Leave");
                    		Thread.sleep(200);
                    		System.out.println("2. Continue");
                    		while (leave != 1 || leave != 2) {
                    			leave=input.nextInt();
                    			if (leave ==1 ) {
                    				Thread.sleep(200);
                    				System.out.println("You quickly leave the building and shut the door.");
                    				if (location == 1) {
                    					daggerfall();
                    				}
                    				else if (location == 2) {
                    					camlorn();
                    				}
                    				else if (location == 3) {
                    					wayrest();
                    				}
                    				
                    			}
                    			else if (leave ==2) {
                    				Thread.sleep(200);
                    				System.out.println("You run up the stairs to further clear the tower");
                    				healthAt=(generator.nextInt(25)+10)*level;
                    		        newAttack=attack+ generator.nextInt(5*level);
                    		        xpgain=(generator.nextInt(20)+10)*level;
                    				tower();
                    			}
                    			else {
                    				System.out.println("Choose one of the previously mentioned choices");
                    			}
                    		}
                    	}
            		}
            		if (character ==2) {
            			Thread.sleep(200);
            			System.out.println("You grab a shield and ram the enemy for tons of damage");
               			System.out.println(name + " hits the " + monster + " for 200");  
            			healthAt-=200;
                    	if (healthAt <=0) {
                    		xp +=xpgain;
                    		if (xp >= xptolevel) {
                    			level += 1;
                    			xpadder= xp-xptolevel;
                    			xp=0;
                    			xp+=xpadder;
                    			xpadder=0;
                    			xptolevel*=level;
                    			xptolevel+=50;
                    			health = level*5+health;
                    			attack = level*5+attack;
                    			maxhealth +=30;
                    			health=maxhealth;
                    			System.out.println("****  L E V E L   U P ****");
                    		}
                    		Thread.sleep(1000);
                			System.out.println(name + "'s Health: "+ health);
                    		System.out.println("You have gained " + xpgain + " XP!");
                    		System.out.println("XP: " + xp + "/" + xptolevel);
                    		Thread.sleep(1000);
                    		System.out.println("Do you wish to continue clearing the building or do you wish to leave?");
                    		Thread.sleep(200);
                    		System.out.println("1. Leave");
                    		Thread.sleep(200);
                    		System.out.println("2. Continue");
                    		while (leave != 1 || leave != 2) {
                    			leave=input.nextInt();
                    			if (leave ==1 ) {
                    				Thread.sleep(200);
                    				System.out.println("You quickly leave the building and shut the door.");
                    				if (location == 1) {
                    					daggerfall();
                    				}
                    				else if (location == 2) {
                    					camlorn();
                    				}
                    				else if (location == 3) {
                    					wayrest();
                    				}
                    				
                    			}
                    			else if (leave ==2) {
                    				Thread.sleep(200);
                    				System.out.println("You run up the stairs to further clear the tower");
                    				healthAt=(generator.nextInt(25)+10)*level;
                    		        newAttack=attack+ generator.nextInt(5*level);
                    		        xpgain=(generator.nextInt(20)+10)*level;
                    				tower();
                    			}
                    			else {
                    				System.out.println("Choose one of the previously mentioned choices");
                    			}
                    		}
                    	}
                    	
            			
            		}
            		if (character ==3) {
            			Thread.sleep(200);
            			System.out.println("You take take out of small blade and quickly slash the enemy multiple times.");
               			System.out.println(name + " hits the " + monster + " for 500");  
            			healthAt-=500;
                    	if (healthAt <=0) {
                    		xp +=xpgain;
                    		if (xp >= xptolevel) {
                    			level += 1;
                    			xpadder= xp-xptolevel;
                    			xp=0;
                    			xp+=xpadder;
                    			xpadder=0;
                    			xptolevel*=level;
                    			xptolevel+=50;
                    			health = level*5+health;
                    			attack = level*5+attack;
                    			maxhealth +=30;
                    			health=maxhealth;
                    			System.out.println("****  L E V E L   U P ****");
                    		}
                    		Thread.sleep(1000);
                			System.out.println(name + "'s Health: "+ health);
                    		System.out.println("You have gained " + xpgain + " XP!");
                    		System.out.println("XP: " + xp + "/" + xptolevel);
                    		Thread.sleep(1000);
                    		System.out.println("Do you wish to continue clearing the building or do you wish to leave?");
                    		Thread.sleep(200);
                    		System.out.println("1. Leave");
                    		Thread.sleep(200);
                    		System.out.println("2. Continue");
                    		while (leave != 1 || leave != 2) {
                    			leave=input.nextInt();
                    			if (leave ==1 ) {
                    				Thread.sleep(200);
                    				System.out.println("You quickly leave the building and shut the door.");
                    				if (location == 1) {
                    					daggerfall();
                    				}
                    				else if (location == 2) {
                    					camlorn();
                    				}
                    				else if (location == 3) {
                    					wayrest();
                    				}
                    				
                    			}
                    			else if (leave ==2) {
                    				Thread.sleep(200);
                    				System.out.println("You run up the stairs to further clear the tower");
                    				healthAt=(generator.nextInt(25)+10)*level;
                    		        newAttack=attack+ generator.nextInt(5*level);
                    		        xpgain=(generator.nextInt(20)+10)*level;
                    				tower();
                    			}
                    			else {
                    				System.out.println("Choose one of the previously mentioned choices");
                    			}
                    			
                    		}
                    		
                    		
                    	}
                    	
            			
            		}
            	}
            	else if((xptolevel-xp)>=30) {
                	System.out.println("That is not a choice!");
                	damage = generator.nextInt(5)+1;            
                	System.out.println("The Fire Atronach hits " + name + " for " + damage);
                	health-=damage;
            	}
            }
            else {
            	System.out.println("That is not a choice!");
            	damage = generator.nextInt(5)+1;            
            	System.out.println("The Fire Atronach hits " + name + " for " + damage);
            	health-=damage;
            }
		}
		

	}
	public static void welcomeVisitor() throws InterruptedException{

	}
	public static void dead() {
		//when the player dies
		System.out.println("You have died.");
		System.out.println("Try again next time.");
		System.exit(0);
	}
	
	public static void choosingCity() throws InterruptedException{
		//when the player is choosing the city. the code processing the different locations
		System.out.println("Which city shall you go to?");
		Thread.sleep(1000);
		System.out.println("1. Daggerfall: The capital city of High Rock and the largest city in Tamriel");
		Thread.sleep(200);
		System.out.println("2. Camlorn: The home of the military and the hub of provincial land-trade");
		Thread.sleep(200);
		System.out.println("3. Wayrest: The largest port city of all Tamriel, hosting the naval fleet of High Rock");
		int cityChoice = 0;
		Scanner input = new Scanner(System.in);
		while (cityChoice != 1 || cityChoice != 2 || cityChoice != 3) {
			cityChoice = input.nextInt();
			if (cityChoice == 1) {
				Thread.sleep(1000);
				location =1;
				System.out.println("You see the towering castles and massive keeps of the city along with hundreds of thousands of people.");
				daggerfall();
			}
			else if (cityChoice == 2) {
				Thread.sleep(1000);
				location =2;
				System.out.println("You enter the massive gates of Camlorn in awe, watching legions of soldiers running out into battle in a faraway location.");
				camlorn();
			}
			else if (cityChoice == 3) {
				Thread.sleep(1000);
				location =3;
				System.out.println("You get to Wayrest by boat, and from the boat, all you can see are the massive galleons and floating fortresses defending the city.");
				wayrest();
			}
			else {
				System.out.print("Please choose one of the previously mentioned choices.");
			}
		}	
	}
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		intro();
		choosingCity();
	}
	
	
	//this information is the global variables and such for the the whole code
	public static int health = 50;
	public static int level = 1;
	
	public static int attack = 15;
	public static int maxhealth = 50;
	
	public static int xp = 0;
	public static int xptolevel = 100;
	
	public static String name;
	
	public static int xpadder=0;
	
	public static boolean bosscheck=false;
	
	public static boolean victory=false;
	
	public static int location=0;
	
	public static String[] nameList = {"Fire Atronach","Wisp","Bandit", "Dreugh", "Daedra"};

	public static int specialAbilily = 0;
	
	public static int character=  0;
	
	public static int possible = 0;
	
	public static Random generator = new Random();
	
	public static String monster;
}

