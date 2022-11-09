package library;
import java.util.Scanner;

public class Customer {
public static void main(String[] args) {
	System.out.println("================================================");
	System.out.println("<------ Welcome to The Big Bookstore :) -------> ");
	System.out.println("-------------------------------------------------");

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Choose an option");
	    System.out.println("\n");
	    System.out.println("********************************************");
        System.out.println("Press 1 for Comics");
        System.out.println("Press 2 for Crime/Thriller/Action");
        System.out.println("Press 3 for Fiction");
        System.out.println("Press 4 for Children's Books");
        System.out.println("Press 5 for Biography/Autobiography");
        System.out.println("Press 6 for Self Help Books");
        System.out.println("Press 7 for Religion");
        System.out.println("Press 8 for Exit");
        int option = 0;

        do {
        	try {
        	
          option = sc.nextInt();
        	}
        	catch (Exception e) {
        		System.out.println("fjf");
        	}
        	
        	System.out.println("\n");
        	 switch (option){
                case 1 : 
                	System.out.println("Please choose the category in Comics");
    			    System.out.println("\n");
    			    System.out.println("********************************************");
    		        System.out.println("Press 1 for Anime & Manga");
    		        System.out.println("Press 2 for DC Comics");
    		        System.out.println("Press 3 for Cartooning");
    		    	
                	option = sc.nextInt();
		        	System.out.println("\n");
		        	
		        	    switch (option){
		                case 1 :
                	        System.out.println("Books available in Anime & Manga: ");
                	        System.out.println("\n");
    			            System.out.println("********************************************");
                	        System.out.println("press 1 for Naruto");
                	        System.out.println("press 2 for Spy X Family");
                	        System.out.println("press 3 for Tokyo Ghoul");
                	        System.out.println("press 4 for Death Note");
                	        System.out.println("press 5 for Demon Slayer");
                	        System.out.println("press 6 for Jujutsu Kaisen");
                	        System.out.println("press 7 for One Piece");
                	        
                	        option= sc.nextInt();
                	         switch(option) {
                	          case 1: 
                		           System.out.println("Naruto, Anime & Manga");
                		           System.out.println("=======================================");
                		           Book b1  = new Comics ("Naruto","Masashi Kishimoto",2003,995);
                		            b1.detail ();
                		            System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");

                		            String review1 = sc.next();
                		            b1.setReview(review1);
                		            System.out.println("Your rating is : " + b1.getReview());
                		           break;
                	          case 2: 
                	        	  System.out.println("Spy X Family, Anime & Manga");
               		              System.out.println("=======================================");
               		              Book b2  = new Comics ("Spy X Family","Tatsuya Endo",2020,895);
               		              b2.detail ();
               		           System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");

               		              String review2 = sc.next();
               		              b2.setReview(review2);
               		              System.out.println("Your rating is : " + b2.getReview());
               		              break;
                	          case 3:
                	        	  System.out.println("Tokyo Ghoul, Anime & Manga");
               		              System.out.println("=======================================");
               		              Book b3  = new Comics ("Tokyo Ghoul","Sui Ishida", 2015, 795);
               		              b3.detail ();
               		           System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");

               		              String review3 = sc.next();
               		              b3.setReview(review3);
               		              System.out.println("Your rating is : " + b3.getReview());
               		               break;
                	          case 4:
                	        	  System.out.println("Death Note, Anime & Manga");
               		              System.out.println("=======================================");
               		              Book b4  = new Comics ("Death Note","Tsugumi Ohba", 2012, 885);
               		              b4.detail ();
               		           System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");

               		              String review4 = sc.next();
               		              b4.setReview(review4);
               		              System.out.println("Your rating is : " + b4.getReview());
               		              break;
                	          case 5:
                	        	  System.out.println("Demon Slayer, Anime & Manga");
               		              System.out.println("=======================================");
               		              Book b5  = new Comics ("Demon Slayer","Koyoharu Gotouge", 2018, 885);
               		              b5.detail ();
               		           System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");

               		              String review5 = sc.next();
               		              b5.setReview(review5);
               		              System.out.println("Your rating is : " + b5.getReview());
               		              break;
                	          case 6:
                	        	  System.out.println("Jujutsu Kaisen, Anime & Manga");
               		              System.out.println("=======================================");
               		              Book b6  = new Comics ("Jujutsu Kaisen","Gege Akutami", 2018, 685);
               		              b6.detail ();
               		           System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");

               		              String review6 = sc.next();
               		              b6.setReview(review6);
               		              System.out.println("Your rating is : " + b6.getReview());
               		              break;
                	          case 7:
                	        	  System.out.println("One Piece, Anime & Manga");
               		              System.out.println("=======================================");
               		              Book b7  = new Comics ("One Piece","Eiichiro Oda", 2020, 985);
               		              b7.detail ();
               		           System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");

               		              String review7 = sc.next();
               		              b7.setReview(review7);
               		              System.out.println("Your rating is : " + b7.getReview());
               		              break;
                	          default:
                		             System.out.println("Choose a correct option to proceed");
		                               break;
		                    }
                	      break;
		        	    case 2:
		                	  System.out.println("Books available in DC Comics: ");
	                	        System.out.println("\n");
	    			            System.out.println("********************************************");
	                	        System.out.println("press 1 for Batman: The Killing Joke");
	                	        System.out.println("press 2 for V for Vendetta");
	                	        System.out.println("press 3 for Batman : Year One");
	                	        System.out.println("press 4 for Superman");
	                	        option= sc.nextInt();
	                	         switch(option) {
	                	         
	                	         case 1:
	                	        	 System.out.println("Batman: The Killing Joke, DC Comics");
	               		              System.out.println("=======================================");
	               		              Book b1  = new Comics ("Batman: The Killing Joke","Alan Moore", 2008, 955);
	               		              b1.detail ();
	               		           System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");

	               		              String review1 = sc.next();
	               		              b1.setReview(review1);
	               		              System.out.println("Your rating is : " + b1.getReview());
	               		              break;
	                	         case 2: 
	                	        	 System.out.println("V for Vendetta, DC Comics");
	               		              System.out.println("=======================================");
	               		              Book b2  = new Comics ("V for Vendetta","Alan Moore", 1995, 755);
	               		              b2.detail ();
	               		           System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
	               		              String review2 = sc.next();
	               		              b2.setReview(review2);
	               		              System.out.println("Your rating is : " + b2.getReview());
	               		             break;
	                	         case 3: 
	                	        	 System.out.println("Batman : Year One, DC Comics");
	               		              System.out.println("=======================================");
	               		              Book b3  = new Comics ("Batman : Year One","Frank Miller", 2007, 865);
	               		              b3.detail ();
	               		           System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
                                      String review3 = sc.next();
	               		              b3.setReview(review3);
	               		              System.out.println("Your rating is : " + b3.getReview());
	               		               break;
	                	         case 4: 
	                	        	 System.out.println("Superman, DC Comics");
	               		              System.out.println("=======================================");
	               		              Book b4  = new Comics ("Superman","Steven Kotler", 2014, 455);
	               		              b4.detail ();
	               		           System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
	               		              String review4 = sc.next();
	               		              b4.setReview(review4);
	               		              System.out.println("Your rating is : " + b4.getReview());
	               		              break;
	                	         default:
                		             System.out.println("Choose a correct option to proceed");
		                               break;
	                	         }
	                	         
	                 	        break;
	 		        	    
	 		                  case 3:
	 		                	  System.out.println("Books available in Cartooning: ");
	 	                	        System.out.println("\n");
	 	    			            System.out.println("********************************************");
	 	                	        System.out.println("press 1 for Diary of a Wimpy Kid");
	 	                	        System.out.println("press 2 for Archie");
	 	                	        System.out.println("press 3 for Disney Sketchbook");
	 	                	        option= sc.nextInt();
	 	                	         switch(option) {
	 	                	         case 1:
	 	                	        	System.out.println("Diary of a Wimpy Kid, Cartooning");
		               		              System.out.println("=======================================");
		               		              Book b1  = new Comics ("Diary of a Wimpy Kid","Jeff Kinney", 2007, 895);
		               		              b1.detail ();
		               		           System.out.println("Please give a rating out of:");
				    		              System.out.println("Excellent");
				    		              System.out.println("Good");
				    		              System.out.println("Satisfactory");
				    		              System.out.println("Poor");
		               		              String review1 = sc.next();
		               		              b1.setReview(review1);
		               		              System.out.println("Your rating is : " + b1.getReview());
		               		             break;
	 	                	        case 2:
	 	                	        	System.out.println("Archie, Cartooning");
		               		              System.out.println("=======================================");
		               		              Book b2  = new Comics ("Archie","Stan Goldberg", 2007, 595);
		               		              b2.detail ();
		               		           System.out.println("Please give a rating out of:");
				    		              System.out.println("Excellent");
				    		              System.out.println("Good");
				    		              System.out.println("Satisfactory");
				    		              System.out.println("Poor");
		               		              String review2 = sc.next();
		               		              b2.setReview(review2);
		               		              System.out.println("Your rating is : " + b2.getReview());
		               		              break;
	 	                	       case 3:
	 	                	        	System.out.println("Disney Sketchbook, Cartooning");
		               		              System.out.println("=======================================");
		               		              Book b3  = new Comics ("Disney Sketchbook","Ken Shue", 2012, 365);
		               		              b3.detail ();
		               		           System.out.println("Please give a rating out of:");
				    		              System.out.println("Excellent");
				    		              System.out.println("Good");
				    		              System.out.println("Satisfactory");
				    		              System.out.println("Poor");
		               		              String review3 = sc.next();
		               		              b3.setReview(review3);
		               		              System.out.println("Your rating is : " + b3.getReview());
		               		              break;
	 	                	      default:
	                		             System.out.println("Choose a correct option to proceed");
			                               break;
		               		              
	 	                	         }
	 	                	         
	                	         break;
	                	                         	       
		                  default:
		                		System.out.println("Choose a correct option to proceed");
			                    break;			                         		
                	}
		        	
                    break;
		        	
		        	
                case 2 :
                	System.out.println("Please choose the category in Crime/Thriller/Mystery");
    			    System.out.println("\n");
    			    System.out.println("********************************************");
    		        System.out.println("Press 1 for Action & Adventure");
    		        System.out.println("Press 2 for Crime Fiction");
    		        System.out.println("Press 3 for Horror");
    		    	
                	option = sc.nextInt();
		        	System.out.println("\n");
		        	
		        	    switch (option){
		        	    case 1 :
                	        System.out.println("Books available in Action & Adventure: ");
                	        System.out.println("\n");
    			            System.out.println("********************************************");
                	        System.out.println("press 1 for A Good girl's guide to murder");
                	        System.out.println("press 2 for Billy Summers");
                	        System.out.println("press 3 for Silence Breaking");
                	        System.out.println("press 4 for House of Earth & Blood");
                	        System.out.println("press 5 for Broken Bonds");
                	        option= sc.nextInt();
               	         switch(option) {
                	case 1: 
                		System.out.println("A Good girl's guide to murder, Action & Adventure");
     		              System.out.println("=======================================");
     		              Book b1  = new Crime ("A Good girl's guide to murder","Holly Jackson", 2019, 895);
     		              b1.detail ();
     		             System.out.println("Please give a rating out of:");
   		              System.out.println("Excellent");
   		              System.out.println("Good");
   		              System.out.println("Satisfactory");
   		              System.out.println("Poor");
     		              String review1 = sc.next();
     		              b1.setReview(review1);
     		              System.out.println("Your rating is : " + b1.getReview());
     		              break;
                	case 2: 
                		System.out.println("Billy Summers, Action & Adventure");
   		              System.out.println("=======================================");
   		              Book b2 = new Crime ("Billy Summers","Stephen King", 2021, 789);
   		              b2.detail ();
   		           System.out.println("Please give a rating out of:");
		              System.out.println("Excellent");
		              System.out.println("Good");
		              System.out.println("Satisfactory");
		              System.out.println("Poor");
   		              String review2 = sc.next();
   		              b2.setReview(review2);
   		              System.out.println("Your rating is : " + b2.getReview());
   		              break;
                	case 3: 
                		System.out.println("Silence Breaking, Action & Adventure");
   		              System.out.println("=======================================");
   		              Book b3 = new Crime ("Silence Breaking","Robert Thier", 2018, 585);
   		              b3.detail ();
   		           System.out.println("Please give a rating out of:");
		              System.out.println("Excellent");
		              System.out.println("Good");
		              System.out.println("Satisfactory");
		              System.out.println("Poor");
   		              String review3 = sc.next();
   		              b3.setReview(review3);
   		              System.out.println("Your rating is : " + b3.getReview());
   		              break;
                	case 4: 
                		System.out.println("House of Earth & Blood, Action & Adventure");
   		              System.out.println("=======================================");
   		              Book b4 = new Crime ("House of Earth & Blood","Sarah J. Maas", 2020, 785);
   		              b4.detail ();
   		           System.out.println("Please give a rating out of:");
		              System.out.println("Excellent");
		              System.out.println("Good");
		              System.out.println("Satisfactory");
		              System.out.println("Poor");
   		              String review4 = sc.next();
   		              b4.setReview(review4);
   		              System.out.println("Your rating is : " + b4.getReview());
   		              break;
                	case 5: 
                		System.out.println("Broken Bonds, Action & Adventure");
   		              System.out.println("=======================================");
   		              Book b5 = new Crime ("Broken Bonds","J. Bree", 2021, 885);
   		              b5.detail ();
   		           System.out.println("Please give a rating out of:");
		              System.out.println("Excellent");
		              System.out.println("Good");
		              System.out.println("Satisfactory");
		              System.out.println("Poor");
   		              String review5 = sc.next();
   		              b5.setReview(review5);
   		              System.out.println("Your rating is : " + b5.getReview());
   		             break;
                	default:
                		 System.out.println("Choose a correct option to proceed");
		                  break;
                	}
                    break;
		        	    case 2:
		                	  System.out.println("Books available in Crime Fiction: ");
	                	        System.out.println("\n");
	    			            System.out.println("********************************************");
	                	        System.out.println("press 1 for One of Us is Lying");
	                	        System.out.println("press 2 for If we were Villains");
	                	        System.out.println("press 3 for Gone Girl");
	                	        System.out.println("press 4 for The complete Sherlock Holmes");
	                	        option= sc.nextInt();
	                	         switch(option) {
	                	         case 1:
	                	        	 System.out.println("One of Us is Lying, Crime Fiction");
	              		              System.out.println("=======================================");
	              		              Book b1 = new Crime ("One of Us is Lying","Karen M.McManus", 2017, 578);
	              		              b1.detail ();
	              		            System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
	              		              String review1 = sc.next();
	              		              b1.setReview(review1);
	              		              System.out.println("Your rating is : " + b1.getReview());
	              		             break;
	                	         case 2:
	                	        	 System.out.println("If we were Villains, Crime Fiction");
	              		              System.out.println("=======================================");
	              		              Book b2 = new Crime ("If we were Villains","M.L Rio", 2017, 788);
	              		              b2.detail ();
	              		            System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
	              		              String review2 = sc.next();
	              		              b2.setReview(review2);
	              		              System.out.println("Your rating is : " + b2.getReview());
	              		              break;
	                	         case 3:
	                	        	 System.out.println("Gone Girl, Crime Fiction");
	              		              System.out.println("=======================================");
	              		              Book b3 = new Crime ("Gone Girl","Flynn Gillian", 2012, 785);
	              		              b3.detail ();
	              		            System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
	              		              String review3 = sc.next();
	              		              b3.setReview(review3);
	              		              System.out.println("Your rating is : " + b3.getReview());
	              		              break;
	                	         case 4:
	                	        	 System.out.println("The complete Sherlock Holmes, Crime Fiction");
	              		              System.out.println("=======================================");
	              		              Book b4 = new Crime ("The complete Sherlock Holmes","Sir Arthur Conan Doyle", 2011, 955);
	              		              b4.detail ();
	              		            System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
	              		              String review4 = sc.next();
	              		              b4.setReview(review4);
	              		              System.out.println("Your rating is : " + b4.getReview());
	              		             break;
	                	         default:
                		             System.out.println("Choose a correct option to proceed");
		                               break;
	                	         }
	                	         break;
		        	    case 3:
		        	    	System.out.println("Books available in Horror: ");
                	        System.out.println("\n");
    			            System.out.println("********************************************");
                	        System.out.println("press 1 for Home Before Dark");
                	        System.out.println("press 2 for Imaginary Friend");
                	        System.out.println("press 3 for The Girl Next Door");
                	        option= sc.nextInt();
                	         switch(option) {
                	         case 1:
                	        	 System.out.println("Home Before Dark, Horror");
             		              System.out.println("=======================================");
             		              Book b1 = new Crime ("Home Before Dark","Riley Sager", 2020, 755);
             		              b1.detail ();
             		             System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");
             		              String review1 = sc.next();
             		              b1.setReview(review1);
             		              System.out.println("Your rating is : " + b1.getReview());
             		              break;
                	         case 2:
                	        	 System.out.println("Imaginary Friend, Horror");
             		              System.out.println("=======================================");
             		              Book b2 = new Crime ("Imaginary Friend","Stephen Chbosky", 2012, 895);
             		              b2.detail ();
             		             System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");
             		              String review2 = sc.next();
             		              b2.setReview(review2);
             		              System.out.println("Your rating is : " + b2.getReview());
             		             break;
                	         case 3:
                	        	 System.out.println("The Girl Next Door, Horror");
             		              System.out.println("=======================================");
             		              Book b3 = new Crime ("The Girl Next Door","Jack Ketchum", 2005, 785);
             		              b3.detail ();
             		             System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");
             		              String review3 = sc.next();
             		              b3.setReview(review3);
             		              System.out.println("Your rating is : " + b3.getReview());
             		              break;
                	         default:
            		             System.out.println("Choose a correct option to proceed");
	                               break;
	            		              
	                	         }
	                	         
            	         break;
            	                         	       
                  default:
                		System.out.println("Choose a correct option to proceed");
	                    break;			                         		
        	}
        	
            break;	    	
                case 3 :
                 	System.out.println("Please choose the category in Fiction");
    			    System.out.println("\n");
    			    System.out.println("********************************************");
    		        System.out.println("Press 1 for Romance Fantasy");
    		        System.out.println("Press 2 for Adventure");
    		        System.out.println("Press 3 for American Fiction");
    		    	
                	option = sc.nextInt();
		        	System.out.println("\n");
		        	
		        	    switch (option) {
		        	    case 1 :
                	        System.out.println("Books available in Romance Fantasy ");
                	        System.out.println("\n");
    			            System.out.println("********************************************");
                	        System.out.println("press 1 for The fault in our stars");
                	        System.out.println("press 2 for The Queen");
                	        System.out.println("press 3 for It ends with us");
                	        System.out.println("press 4 for Verity");
                	        System.out.println("press 5 for Ugly Love");
                	        option= sc.nextInt();
               	         switch(option) {
		        	    
                	case 1: 
                		 System.out.println("The fault in our stars, Romance Fantasy");
    		              System.out.println("=======================================");
    		              Book b1 = new Fiction ("The fault in our stars","John Green", 2012, 955);
    		              b1.detail ();
    		              System.out.println("Please give a rating out of:");
    		              System.out.println("Excellent");
    		              System.out.println("Good");
    		              System.out.println("Satisfactory");
    		              System.out.println("Poor");
    		              String review1 = sc.next();
    		              b1.setReview(review1);
    		              System.out.println("Your rating is : " + b1.getReview());
    		           break;
                	case 2: 
                		System.out.println("The Queen, Romance Fantasy");
  		              System.out.println("=======================================");
  		              Book b2 = new Fiction ("The Queen","Kiera Cass", 2014, 655);
  		              b2.detail ();
  		            System.out.println("Please give a rating out of:");
		              System.out.println("Excellent");
		              System.out.println("Good");
		              System.out.println("Satisfactory");
		              System.out.println("Poor");
  		              String review2 = sc.next();
  		              b2.setReview(review2);
  		              System.out.println("Your rating is : " + b2.getReview());
  		           break;
                	case 3:
                		System.out.println("It ends with us, Romance Fantasy");
    		              System.out.println("=======================================");
    		              Book b3 = new Fiction ("It ends with us","Colleen Hoover", 2016, 855);
    		              b3.detail ();
    		              System.out.println("Please give a rating out of:");
    		              System.out.println("Excellent");
    		              System.out.println("Good");
    		              System.out.println("Satisfactory");
    		              System.out.println("Poor");
    		              String review3 = sc.next();
    		              b3.setReview(review3);
    		              System.out.println("Your rating is : " + b3.getReview());
    		              break;
                	case 4:
                		System.out.println("Verity, Romance Fantasy");
  		              System.out.println("=======================================");
  		              Book b4 = new Fiction ("Verity","Colleen Hoover", 2021, 855);
  		              b4.detail ();
  		            System.out.println("Please give a rating out of:");
		              System.out.println("Excellent");
		              System.out.println("Good");
		              System.out.println("Satisfactory");
		              System.out.println("Poor");
  		              String review4 = sc.next();
  		              b4.setReview(review4);
  		              System.out.println("Your rating is : " + b4.getReview());
  		              break;
                	case 5:
                		System.out.println("Ugly Love, Romance Fantasy");
  		              System.out.println("=======================================");
  		              Book b5 = new Fiction ("Ugly Love","Colleen Hoover", 2014, 855);
  		              b5.detail ();
  		            System.out.println("Please give a rating out of:");
		              System.out.println("Excellent");
		              System.out.println("Good");
		              System.out.println("Satisfactory");
		              System.out.println("Poor");
  		              String review5 = sc.next();
  		              b5.setReview(review5);
  		              System.out.println("Your rating is : " + b5.getReview());
  		             break;
                	default:
                		 System.out.println("Choose a correct option to proceed");
		                 break;
                	}
               	         break;
		        	    case 2 :
		        	    	 System.out.println("Books available in Adventure ");
	                	        System.out.println("\n");
	    			            System.out.println("********************************************");
	                	        System.out.println("press 1 for The Complete Harry Potter series");
	                	        System.out.println("press 2 for Sorcery of Thorns");
	                	        System.out.println("press 3 for The Alchemist");
	                	        System.out.println("press 4 for November 9");
	                	        option= sc.nextInt();
	               	         switch(option) {
	               	         case 1:
	               	        	System.out.println("The Complete Harry Potter series, Adventure");
	        		              System.out.println("=======================================");
	        		              Book b1 = new Fiction ("The Complete Harry Potter series","J. K. Rowling", 2009, 1055);
	        		              b1.detail ();
	        		              System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");
	        		              String review1 = sc.next();
	        		              b1.setReview(review1);
	        		              System.out.println("Your rating is : " + b1.getReview());
	        		             break; 
	               	      case 2:
	               	        	System.out.println("Sorcery of Thorns, Adventure");
	        		              System.out.println("=======================================");
	        		              Book b2 = new Fiction ("Sorcery of Thorns","Margaret Rogerson", 2019, 785);
	        		              b2.detail ();
	        		              System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");
	        		              String review2 = sc.next();
	        		              b2.setReview(review2);
	        		              System.out.println("Your rating is : " + b2.getReview());
	        		             break; 
	               	   case 3:
              	        	System.out.println("The Alchemist, Adventure");
       		              System.out.println("=======================================");
       		              Book b3 = new Fiction ("The Alchemist","Paulo Coelho", 1999, 755);
       		              b3.detail ();
       		           System.out.println("Please give a rating out of:");
 		              System.out.println("Excellent");
 		              System.out.println("Good");
 		              System.out.println("Satisfactory");
 		              System.out.println("Poor");
       		              String review3 = sc.next();
       		              b3.setReview(review3);
       		              System.out.println("Your rating is : " + b3.getReview());
       		              break; 
	               	 case 4:
           	        	System.out.println("November 9, Adventure");
    		              System.out.println("=======================================");
    		              Book b4 = new Fiction ("November 9","Colleen Hoover", 2015, 855);
    		              b4.detail ();
    		              System.out.println("Please give a rating out of:");
    		              System.out.println("Excellent");
    		              System.out.println("Good");
    		              System.out.println("Satisfactory");
    		              System.out.println("Poor");
    		              String review4 = sc.next();
    		              b4.setReview(review4);
    		              System.out.println("Your rating is : " + b4.getReview());
    		             break; 
	               	default:
               		 System.out.println("Choose a correct option to proceed");
		                 break;
	               	         }
	               	         break;
		        	    case 3 :
		        	    	 System.out.println("Books available in American Fiction ");
	                	        System.out.println("\n");
	    			            System.out.println("********************************************");
	                	        System.out.println("press 1 for Twisted Love");
	                	        System.out.println("press 2 for All the light we cannot see");
	                	        System.out.println("press 3 for Beloved");
	                	        option= sc.nextInt();
	               	         switch(option) {
	               	         case 1: 
	               	      System.out.println("Twisted Love, American Fiction");
    		              System.out.println("=======================================");
    		              Book b1 = new Fiction ("Twisted Love","Ana Huang", 2021, 685);
    		              b1.detail ();
    		              System.out.println("Please give a rating out of:");
    		              System.out.println("Excellent");
    		              System.out.println("Good");
    		              System.out.println("Satisfactory");
    		              System.out.println("Poor");
    		              String review1 = sc.next();
    		              b1.setReview(review1);
    		              System.out.println("Your rating is : " + b1.getReview());
    		              break; 
	               	      case 2: 
		               	      System.out.println("All the light we cannot see, American Fiction");
	    		              System.out.println("=======================================");
	    		              Book b2 = new Fiction ("All the light we cannot see","Anthony Doerr", 2014, 587);
	    		              b2.detail ();
	    		              System.out.println("Please give a rating out of:");
	    		              System.out.println("Excellent");
	    		              System.out.println("Good");
	    		              System.out.println("Satisfactory");
	    		              System.out.println("Poor");
	    		              String review2 = sc.next();
	    		              b2.setReview(review2);
	    		              System.out.println("Your rating is : " + b2.getReview());
	    		              break; 
	               	   case 3: 
		               	      System.out.println("Beloved, American Fiction");
	    		              System.out.println("=======================================");
	    		              Book b3 = new Fiction ("Beloved","Toni Morrison", 2004, 768);
	    		              b3.detail ();
	    		              System.out.println("Please give a rating out of:");
	    		              System.out.println("Excellent");
	    		              System.out.println("Good");
	    		              System.out.println("Satisfactory");
	    		              System.out.println("Poor");
	    		              String review3 = sc.next();
	    		              b3.setReview(review3);
	    		              System.out.println("Your rating is : " + b3.getReview());
	    		              break; 
	               	default:
	               		 System.out.println("Choose a correct option to proceed");
			                 break;
	               	         }
	            	         break;
                   	       
		                  default:
		                		System.out.println("Choose a correct option to proceed");
			                    break;			                         		
		        	}
		        	
		            break;	    	
		                case 4:
		                 	System.out.println("Please choose the category in Children's Books");
		    			    System.out.println("\n");
		    			    System.out.println("********************************************");
		    		        System.out.println("Press 1 for Fairy Tales");
		    		        System.out.println("Press 2 for Lit Fiction");
		    		        System.out.println("Press 3 for Mysteries & Detective Stories");
		    		    	
		                	option = sc.nextInt();
				        	System.out.println("\n");
				        	  switch (option) {
				        	    case 1 :
		                	        System.out.println("Books available in Fairy Tales: ");
		                	        System.out.println("\n");
		    			            System.out.println("********************************************");
		                	        System.out.println("press 1 for The Lightening Thief");
		                	        System.out.println("press 2 for Cinderella");
		                	        System.out.println("press 3 for Fairest of all");
		                	        System.out.println("press 4 for Mirror, Mirror");
		                	        option= sc.nextInt();
		               	         switch(option) {
		               	         case 1 :
		               	        	System.out.println("The Lightening Thief, Fairy Tales");
			    		              System.out.println("=======================================");
			    		              Book b1 = new Children ("The Lightening Theif","Rick Riordan", 2005, 456);
			    		              b1.detail ();
			    		              System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
			    		              String review1 = sc.next();
			    		              b1.setReview(review1);
			    		              System.out.println("Your rating is : " + b1.getReview());
			    		              break; 
		               	      case 2 :
		               	        	System.out.println("Cinderella, Fairy Tales");
			    		              System.out.println("=======================================");
			    		              Book b2 = new Children ("Cinderella","Regis Maine", 2010, 435);
			    		              b2.detail ();
			    		              System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
			    		              String review2 = sc.next();
			    		              b2.setReview(review2);
			    		              System.out.println("Your rating is : " + b2.getReview());
			    		             break; 
		               	   case 3 :
	               	        	System.out.println("Fairest of all, Fairy Tales");
		    		              System.out.println("=======================================");
		    		              Book b3 = new Children ("Fairest of all","Valentino, Serena", 2012, 525);
		    		              b3.detail ();
		    		              System.out.println("Please give a rating out of:");
		    		              System.out.println("Excellent");
		    		              System.out.println("Good");
		    		              System.out.println("Satisfactory");
		    		              System.out.println("Poor");
		    		              String review3 = sc.next();
		    		              b3.setReview(review3);
		    		              System.out.println("Your rating is : " + b3.getReview());
		    		              break; 
		               	case 4 :
               	        	System.out.println("Mirror, Mirror, Fairy Tales");
	    		              System.out.println("=======================================");
	    		              Book b4 = new Children ("Mirror, Mirror","Calonita Jen", 2003, 384);
	    		              b4.detail ();
	    		              System.out.println("Please give a rating out of:");
	    		              System.out.println("Excellent");
	    		              System.out.println("Good");
	    		              System.out.println("Satisfactory");
	    		              System.out.println("Poor");
	    		              String review4 = sc.next();
	    		              b4.setReview(review4);
	    		              System.out.println("Your rating is : " + b4.getReview());
	    		              break; 
		               	default:
		               		 System.out.println("Choose a correct option to proceed");
				                 break;
		               	         }
		               	         break;
				        	    case 2:
				        	        System.out.println("Books available in Lit Fiction ");
		                	        System.out.println("\n");
		    			            System.out.println("********************************************");
		                	        System.out.println("press 1 for Her Royal Highness");
		                	        System.out.println("press 2 for Matlida");
		                	        option= sc.nextInt();
		               	         switch(option) {
		               	         case 1 :
		               	        	System.out.println("Her Royal Highness, Lit Fiction");
			    		              System.out.println("=======================================");
			    		              Book b1 = new Children ("Her Royal Highness","Rachel Hawkins", 2019, 584);
			    		              b1.detail ();
			    		              System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
			    		              String review1 = sc.next();
			    		              b1.setReview(review1);
			    		              System.out.println("Your rating is : " + b1.getReview());
			    		              break; 
		               	      case 2 :
		               	        	System.out.println("Matlida, Lit Fiction");
			    		              System.out.println("=======================================");
			    		              Book b2 = new Children ("Matlida","Sussex, Lucy", 2014, 484);
			    		              b2.detail ();
			    		              System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
			    		              String review2 = sc.next();
			    		              b2.setReview(review2);
			    		              System.out.println("Your rating is : " + b2.getReview());
			    		              break; 
		               	 	default:
			               		 System.out.println("Choose a correct option to proceed");
					                 break;
		               	         }
		               	         break;
				        	    case 3: 
				        	    	System.out.println("Books available in Mysteries & Detective Stories: ");
		                	        System.out.println("\n");
		    			            System.out.println("********************************************");
		                	        System.out.println("press 1 for Sad Girls");
		                	        System.out.println("press 2 for Famous Five");
		                	        System.out.println("press 3 for The Scandal");
		                	        option= sc.nextInt();
		               	         switch(option) {
		               	      case 1 :
		               	        	System.out.println("Sad Girls, Mysteries & Detective Stories");
			    		              System.out.println("=======================================");
			    		              Book b1 = new Children ("Sad Girls","Leav Lang", 2017, 654);
			    		              b1.detail ();
			    		              System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
			    		              String review1 = sc.next();
			    		              b1.setReview(review1);
			    		              System.out.println("Your rating is : " + b1.getReview());
			    		              break; 
		               	      case 2:
			    		              System.out.println("Famous Five, Mysteries & Detective Stories");
			    		              System.out.println("=======================================");
			    		              Book b2 = new Children ("Famous Five","Enid Blyton", 2001, 586);
			    		              b2.detail ();
			    		              System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
			    		              String review2 = sc.next();
			    		              b2.setReview(review2);
			    		              System.out.println("Your rating is : " + b2.getReview());
			    		             break; 
		               	      case 3:
			    		              System.out.println("The Scandal, Mysteries & Detective Stories");
			    		              System.out.println("=======================================");
			    		              Book b3 = new Children ("The Scandal","Enid Blyton", 2001, 586);
			    		              b3.detail ();
			    		              System.out.println("Please give a rating out of:");
			    		              System.out.println("Excellent");
			    		              System.out.println("Good");
			    		              System.out.println("Satisfactory");
			    		              System.out.println("Poor");
			    		              String review3 = sc.next();
			    		              b3.setReview(review3);
			    		              System.out.println("Your rating is : " + b3.getReview());
			    		             break; 
		               		default:
			               		 System.out.println("Choose a correct option to proceed");
					                 break;
		               	         }
		             	         break;
                       	       
				                  default:
				                		System.out.println("Choose a correct option to proceed");
					                    break;			                         		
				        	}
				        	
				            break;	    	
		                case 5 :
				                	System.out.println("Please choose the category in Biography & AutoBiography");
				    			    System.out.println("\n");
				    			    System.out.println("********************************************");
				    		        System.out.println("Press 1 for Artists, Philosophers, Photographers");
				    		        System.out.println("Press 2 for Business, Finance");
				    		        
				    		        option = sc.nextInt();
						        	System.out.println("\n");
						        	
						        	    switch (option) {
						        	    case 1 :
				                	        System.out.println("Books available in Artists, Philosophers, Photographers ");
				                	        System.out.println("\n");
				    			            System.out.println("********************************************");
				                	        System.out.println("press 1 for Just Kids");
				                	        System.out.println("press 2 for Leonardo Da Vinci");
				                	        System.out.println("press 3 for Under the Tulip Tree");
				                	        option= sc.nextInt();
				               	         switch(option) {
				               	         case 1 :
				               	        	System.out.println("Just Kids, Artists, Philosophers, Photographers");
					    		              System.out.println("=======================================");
					    		              Book b1 = new Biography ("Just Kids","Patti Smith", 2010, 786);
					    		              b1.detail ();
					    		              System.out.println("Please give a rating out of:");
					    		              System.out.println("Excellent");
					    		              System.out.println("Good");
					    		              System.out.println("Satisfactory");
					    		              System.out.println("Poor");
					    		              String review1 = sc.next();
					    		              b1.setReview(review1);
					    		              System.out.println("Your rating is : " + b1.getReview());
					    		              break; 
				               	      case 2:
				    		              System.out.println("Leonardo Da Vinci, Artists, Philosophers, Photographers");
				    		              System.out.println("=======================================");
				    		              Book b2 = new Biography ("Leonardo Da Vinci","Walter Isaacson", 2017, 886);
				    		              b2.detail ();
				    		              System.out.println("Please give a rating out of:");
				    		              System.out.println("Excellent");
				    		              System.out.println("Good");
				    		              System.out.println("Satisfactory");
				    		              System.out.println("Poor");
				    		              String review2 = sc.next();
				    		              b2.setReview(review2);
				    		              System.out.println("Your rating is : " + b2.getReview());
				    		             break; 
			               	      case 3:
				    		              System.out.println("Under the Tulip Tree, Philosophers, Photographers");
				    		              System.out.println("=======================================");
				    		              Book b3 = new Biography ("Under the Tulip Tree","Michelle Shocklee", 2020, 869);
				    		              b3.detail ();
				    		              System.out.println("Please give a rating out of:");
				    		              System.out.println("Excellent");
				    		              System.out.println("Good");
				    		              System.out.println("Satisfactory");
				    		              System.out.println("Poor");
				    		              String review3 = sc.next();
				    		              b3.setReview(review3);
				    		              System.out.println("Your rating is : " + b3.getReview());
				    		              break; 
			               		default:
				               		 System.out.println("Choose a correct option to proceed");
						                 break;
			               	         }
						        	  break;
						        	    case 2 :
						        	    	System.out.println("Books available in Business, Finance");
				                	        System.out.println("\n");
				    			            System.out.println("********************************************");
				                	        System.out.println("press 1 for When Genius Failed");
				                	        System.out.println("press 2 for Rich Dad Poor Dad");
				                	        System.out.println("press 3 for The Power of Discipline");
				                	        option= sc.nextInt();
				               	         switch(option) {
				               	         case 1 :
				               	        	System.out.println("When Genius Failed, Business, Finance");
					    		              System.out.println("=======================================");
					    		              Book b1 = new Biography ("When Genius Failed","Patti Smith", 2010, 786);
					    		              b1.detail ();
					    		              System.out.println("Please give a rating out of:");
					    		              System.out.println("Excellent");
					    		              System.out.println("Good");
					    		              System.out.println("Satisfactory");
					    		              System.out.println("Poor");
					    		              String review1 = sc.next();
					    		              b1.setReview(review1);
					    		              System.out.println("Your rating is : " + b1.getReview());
					    		              break; 
				               	      case 2:
				    		              System.out.println("Rich Dad Poor Dad, Business, Finance");
				    		              System.out.println("=======================================");
				    		              Book b2 = new Biography ("Rich Dad Poor Dad","Walter Isaacson", 2017, 886);
				    		              b2.detail ();
				    		              System.out.println("Please give a rating out of:");
				    		              System.out.println("Excellent");
				    		              System.out.println("Good");
				    		              System.out.println("Satisfactory");
				    		              System.out.println("Poor");
				    		              String review2 = sc.next();
				    		              b2.setReview(review2);
				    		              System.out.println("Your rating is : " + b2.getReview());
				    		             break; 
			               	      case 3:
				    		              System.out.println("Under the Tulip Tree, Business, Finance");
				    		              System.out.println("=======================================");
				    		              Book b3 = new Biography ("Under the Tulip Tree","Michelle Shocklee", 2020, 869);
				    		              b3.detail ();
				    		              System.out.println("Please give a rating out of:");
				    		              System.out.println("Excellent");
				    		              System.out.println("Good");
				    		              System.out.println("Satisfactory");
				    		              System.out.println("Poor");
				    		              String review3 = sc.next();
				    		              b3.setReview(review3);
				    		              System.out.println("Your rating is : " + b3.getReview());
				    		             break; 
			               		default:
				               		 System.out.println("Choose a correct option to proceed");
						                 break;
				               	         }
				               	      break;
			                   	       
						                  default:
						                		System.out.println("Choose a correct option to proceed");
							                    break;			                         		
						        	}
						        	
						            break;	    	
						                case 6:
						                	System.out.println("Please choose the category in Self Help Books");
						    			    System.out.println("\n");
						    			    System.out.println("********************************************");
						    		        System.out.println("Press 1 for Digital Lifestyle");
						    		        System.out.println("Press 2 for Art of Communication");
						    		        
						    		        option = sc.nextInt();
								        	System.out.println("\n");
								        	
								        	    switch (option) {
								        	    case 1 :
						                	        System.out.println("Books available in Digital Lifestyle");
						                	        System.out.println("\n");
						    			            System.out.println("********************************************");
						                	        System.out.println("press 1 for The Shallows");
						                	        System.out.println("press 2 for How to Breakup with your phone");
						                	        System.out.println("press 3 for The Art of Social Media");
						                	        option= sc.nextInt();
						               	         switch(option) {
						               	      case 1 :
						               	        	System.out.println("The Shallows, Digital Lifestyle");
							    		              System.out.println("=======================================");
							    		              Book b1 = new SelfHelp ("The Shallows","Nicholas Carr", 2010, 586);
							    		              b1.detail ();
							    		              System.out.println("Please give a rating out of:");
							    		              System.out.println("Excellent");
							    		              System.out.println("Good");
							    		              System.out.println("Satisfactory");
							    		              System.out.println("Poor");
							    		              String review1 = sc.next();
							    		              b1.setReview(review1);
							    		              System.out.println("Your rating is : " + b1.getReview());
							    		             break; 
						               	      case 2:
						    		              System.out.println("How to Breakup with your phone, Digital Lifestyle");
						    		              System.out.println("=======================================");
						    		              Book b2 = new SelfHelp ("How to Breakup with your phone","Catherine Price", 2018, 886);
						    		              b2.detail ();
						    		              System.out.println("Please give a rating out of:");
						    		              System.out.println("Excellent");
						    		              System.out.println("Good");
						    		              System.out.println("Satisfactory");
						    		              System.out.println("Poor");
						    		              String review2 = sc.next();
						    		              b2.setReview(review2);
						    		              System.out.println("Your rating is : " + b2.getReview());
						    		              break; 
					               	      case 3:
						    		              System.out.println("The Art of Social Media, Digital Lifestyle");
						    		              System.out.println("=======================================");
						    		              Book b3 = new SelfHelp ("The Art of Social Media","Guy Kawasaki", 2014, 869);
						    		              b3.detail ();
						    		              System.out.println("Please give a rating out of:");
						    		              System.out.println("Excellent");
						    		              System.out.println("Good");
						    		              System.out.println("Satisfactory");
						    		              System.out.println("Poor");
						    		              String review3 = sc.next();
						    		              b3.setReview(review3);
						    		              System.out.println("Your rating is : " + b3.getReview());
						    		              break; 
					               		default:
						               		 System.out.println("Choose a correct option to proceed");
								                 break;
						               	         }
						               	         break;
								        	    case 2 :
								        	    	System.out.println("Books available in Art of Communication");
						                	        System.out.println("\n");
						    			            System.out.println("********************************************");
						                	        System.out.println("press 1 for Words that change Minds");
						                	        System.out.println("press 2 for The Art of Public Speaking");
						                	        System.out.println("press 3 for Public Speaking");
						                	        System.out.println("press 4 for Negotiation");
						                	        option= sc.nextInt();
						               	         switch(option) {
						               	         case 1 :
						               	        	System.out.println("Words that change Minds, Art of Communication");
							    		              System.out.println("=======================================");
							    		              Book b1 = new SelfHelp ("Words that change Minds","Shelle Rose Charvet", 2019, 866);
							    		              b1.detail ();
							    		              System.out.println("Please give a rating out of:");
							    		              System.out.println("Excellent");
							    		              System.out.println("Good");
							    		              System.out.println("Satisfactory");
							    		              System.out.println("Poor");
							    		              String review1 = sc.next();
							    		              b1.setReview(review1);
							    		              System.out.println("Your rating is : " + b1.getReview());
							    		              break; 
						               	      case 2:
						    		              System.out.println("The Art of Public Speaking, Art of Communication");
						    		              System.out.println("=======================================");
						    		              Book b2 = new SelfHelp ("The Art of Public Speaking","Dale Carnegie", 2018, 765);
						    		              b2.detail ();
						    		              System.out.println("Please give a rating out of:");
						    		              System.out.println("Excellent");
						    		              System.out.println("Good");
						    		              System.out.println("Satisfactory");
						    		              System.out.println("Poor");
						    		              String review2 = sc.next();
						    		              b2.setReview(review2);
						    		              System.out.println("Your rating is : " + b2.getReview());
						    		              break; 
					               	      case 3:
						    		              System.out.println("Public Speaking, Art of Communication");
						    		              System.out.println("=======================================");
						    		              Book b3 = new SelfHelp ("Public Speaking","Alyson Connolly", 2018, 586);
						    		              b3.detail ();
						    		              System.out.println("Please give a rating out of:");
						    		              System.out.println("Excellent");
						    		              System.out.println("Good");
						    		              System.out.println("Satisfactory");
						    		              System.out.println("Poor");
						    		              String review3 = sc.next();
						    		              b3.setReview(review3);
						    		              System.out.println("Your rating is : " + b3.getReview());
						    		              break; 
					               	   case 4:
					    		              System.out.println("Negotiation, Art of Communication");
					    		              System.out.println("=======================================");
					    		              Book b4 = new SelfHelp ("Negotiation","Tracy, Brian", 2013, 596);
					    		              b4.detail ();
					    		              System.out.println("Please give a rating out of:");
					    		              System.out.println("Excellent");
					    		              System.out.println("Good");
					    		              System.out.println("Satisfactory");
					    		              System.out.println("Poor");
					    		              String review4 = sc.next();
					    		              b4.setReview(review4);
					    		              System.out.println("Your rating is : " + b4.getReview());
					    		              break; 
					               		default:
						               		 System.out.println("Choose a correct option to proceed");
								                 break;
						               	         }
						               	      break;
					                   	       
								                  default:
								                		System.out.println("Choose a correct option to proceed");
									                    break;			                         		
								        	}
								        	
								            break;	    	
								                case 7:
								                	System.out.println("Please choose the category in Religion Books");
								    			    System.out.println("\n");
								    			    System.out.println("********************************************");
								    		        System.out.println("Press 1 for Christianity");
								    		        System.out.println("Press 2 for Hinduism");
								    		        System.out.println("Press 3 for Buddhism");
								    		        System.out.println("Press 4 for Islam");
								    		        System.out.println("Press 5 for Orthodoxy");
								    		        option = sc.nextInt();
										        	System.out.println("\n");
										        	 switch (option) {
										        	    case 1 :
								                	        System.out.println("Books available in Christianity: ");
								                	        System.out.println("\n");
								    			            System.out.println("********************************************");
								                	        System.out.println("press 1 for Mere Christianity");
								                	        System.out.println("press 2 for Prayer secrets");
								                	        System.out.println("press 3 for The Bible Book");
								                	        System.out.println("press 4 for History of the Christian Church");
								                	        option= sc.nextInt();
								               	         switch(option) {
								               	      case 1 :
								               	        	System.out.println("Mere Christianity, Christianity");
									    		              System.out.println("=======================================");
									    		              Book b1 = new Religion ("Mere Christianity","C. S. Lewis", 2001, 866);
									    		              b1.detail ();
									    		              System.out.println("Please give a rating out of:");
									    		              System.out.println("Excellent");
									    		              System.out.println("Good");
									    		              System.out.println("Satisfactory");
									    		              System.out.println("Poor");
									    		              String review1 = sc.next();
									    		              b1.setReview(review1);
									    		              System.out.println("Your rating is : " + b1.getReview());
									    		             break; 
								               	      case 2:
								    		              System.out.println("Prayer secrets, Christianity");
								    		              System.out.println("=======================================");
								    		              Book b2 = new Religion ("Prayer secrets","Kenneth E Hagin", 2009, 765);
								    		              b2.detail ();
								    		              System.out.println("Please give a rating out of:");
								    		              System.out.println("Excellent");
								    		              System.out.println("Good");
								    		              System.out.println("Satisfactory");
								    		              System.out.println("Poor");
								    		              String review2 = sc.next();
								    		              b2.setReview(review2);
								    		              System.out.println("Your rating is : " + b2.getReview());
								    		              break; 
							               	      case 3:
								    		              System.out.println("The Bible Book,Christianity");
								    		              System.out.println("=======================================");
								    		              Book b3 = new Religion ("The Bible Book","Ashish Raichur", 2014, 686);
								    		              b3.detail ();
								    		              System.out.println("Please give a rating out of:");
								    		              System.out.println("Excellent");
								    		              System.out.println("Good");
								    		              System.out.println("Satisfactory");
								    		              System.out.println("Poor");
								    		              String review3 = sc.next();
								    		              b3.setReview(review3);
								    		              System.out.println("Your rating is : " + b3.getReview());
								    		              break; 
							               	   case 4:
							    		              System.out.println("History of the Christian Church, Christianity");
							    		              System.out.println("=======================================");
							    		              Book b4 = new Religion ("History of the Christian Church","Philip Schaff", 2014, 496);
							    		              b4.detail ();
							    		              System.out.println("Please give a rating out of:");
							    		              System.out.println("Excellent");
							    		              System.out.println("Good");
							    		              System.out.println("Satisfactory");
							    		              System.out.println("Poor");
							    		              String review4 = sc.next();
							    		              b4.setReview(review4);
							    		              System.out.println("Your rating is : " + b4.getReview());
							    		              break; 
							               		default:
								               		 System.out.println("Choose a correct option to proceed");
										                 break;
								               	         }
								               	         break;
										        	    case 2:
										        	    	System.out.println("Books available in Hinduism ");
								                	        System.out.println("\n");
								    			            System.out.println("********************************************");
								                	        System.out.println("press 1 for Bhagwad Geeta");
								                	        System.out.println("press 2 for Karma");
								                	        System.out.println("press 3 for Mahabharata");
								                	        System.out.println("press 4 for ASURA: Tale Of The Vanquished");
								                	        System.out.println("press 5 for Sita- Warrior of Mithila");
								                	        option= sc.nextInt();
								               	         switch(option) {
								               	      case 1 :
								               	        	System.out.println("Bhagwad Geeta, Hinduism");
									    		              System.out.println("=======================================");
									    		              Book b1 = new Religion ("Bhagwad Geeta","Dr. Kapil Kakkar", 2001, 866);
									    		              b1.detail ();
									    		              System.out.println("Please give a rating out of:");
									    		              System.out.println("Excellent");
									    		              System.out.println("Good");
									    		              System.out.println("Satisfactory");
									    		              System.out.println("Poor");
									    		              String review1 = sc.next();
									    		              b1.setReview(review1);
									    		              System.out.println("Your rating is : " + b1.getReview());
									    		             break; 
								               	      case 2:
								    		              System.out.println("Karma, Hinduism");
								    		              System.out.println("=======================================");
								    		              Book b2 = new Religion ("Karma","Sadhguru", 2021, 765);
								    		              b2.detail ();
								    		              System.out.println("Please give a rating out of:");
								    		              System.out.println("Excellent");
								    		              System.out.println("Good");
								    		              System.out.println("Satisfactory");
								    		              System.out.println("Poor");
								    		              String review2 = sc.next();
								    		              b2.setReview(review2);
								    		              System.out.println("Your rating is : " + b2.getReview());
								    		             break; 
							               	      case 3:
								    		              System.out.println("Mahabharata,Hinduism");
								    		              System.out.println("=======================================");
								    		              Book b3 = new Religion ("Mahabharata","Bibek Debroy, Vyasa", 2015, 896);
								    		              b3.detail ();
								    		              System.out.println("Please give a rating out of:");
								    		              System.out.println("Excellent");
								    		              System.out.println("Good");
								    		              System.out.println("Satisfactory");
								    		              System.out.println("Poor");
								    		              String review3 = sc.next();
								    		              b3.setReview(review3);
								    		              System.out.println("Your rating is : " + b3.getReview());
								    		              break; 
							               	   case 4:
							    		              System.out.println("ASURA: Tale Of The Vanquished, Hinduism");
							    		              System.out.println("=======================================");
							    		              Book b4 = new Religion ("ASURA: Tale Of The Vanquished","Anand Neelakantan", 2012, 966);
							    		              b4.detail ();
							    		              System.out.println("Please give a rating out of:");
							    		              System.out.println("Excellent");
							    		              System.out.println("Good");
							    		              System.out.println("Satisfactory");
							    		              System.out.println("Poor");
							    		              String review4 = sc.next();
							    		              b4.setReview(review4);
							    		              System.out.println("Your rating is : " + b4.getReview());
							    		              break; 
							               	case 5:
						    		              System.out.println("Sita- Warrior of Mithila, Hinduism");
						    		              System.out.println("=======================================");
						    		              Book b5 = new Religion ("Sita- Warrior of Mithila","Amish Tripathi", 2017, 896);
						    		              b5.detail ();
						    		              System.out.println("Please give a rating out of:");
						    		              System.out.println("Excellent");
						    		              System.out.println("Good");
						    		              System.out.println("Satisfactory");
						    		              System.out.println("Poor");
						    		              String review5 = sc.next();
						    		              b5.setReview(review5);
						    		              System.out.println("Your rating is : " + b5.getReview());
						    		              break; 
							               		default:
								               		 System.out.println("Choose a correct option to proceed");
										                 break;
								               	         }
								               	         break;
										        	    case 3 :
										        	    	System.out.println("Books available in Buddhism ");
								                	        System.out.println("\n");
								    			            System.out.println("********************************************");
								                	        System.out.println("press 1 for The Art of Happiness");
								                	        System.out.println("press 2 for Fear: Essential Wisdom for Getting Through the Storm");
								                	        System.out.println("press 3 for The Way of Zen");
								                	        System.out.println("press 4 for Anger: Wisdom for Cooling the Flamesd");
								                	        System.out.println("press 5 for Silence: The Power of Quiet in a World Full of Noise");
								                	        option= sc.nextInt();
								               	         switch(option) {
								               	      case 1 :
								               	        	System.out.println("The Art of Happiness,Buddhism ");
									    		              System.out.println("=======================================");
									    		              Book b1 = new Religion ("The Art of Happiness","Dalai Lama", 2009, 856);
									    		              b1.detail ();
									    		              System.out.println("Please give a rating out of:");
									    		              System.out.println("Excellent");
									    		              System.out.println("Good");
									    		              System.out.println("Satisfactory");
									    		              System.out.println("Poor");
									    		              String review1 = sc.next();
									    		              b1.setReview(review1);
									    		              System.out.println("Your rating is : " + b1.getReview());
									    		              break; 
								               	      case 2:
								    		              System.out.println("Fear: Essential Wisdom for Getting Through the Storm,Buddhism ");
								    		              System.out.println("=======================================");
								    		              Book b2 = new Religion ("Fear: Essential Wisdom for Getting Through the Storm","Thich Nhat Hanh", 2012, 785);
								    		              b2.detail ();
								    		              System.out.println("Please give a rating out of:");
								    		              System.out.println("Excellent");
								    		              System.out.println("Good");
								    		              System.out.println("Satisfactory");
								    		              System.out.println("Poor");
								    		              String review2 = sc.next();
								    		              b2.setReview(review2);
								    		              System.out.println("Your rating is : " + b2.getReview());
								    		              break; 
							               	      case 3:
								    		              System.out.println("The Way of Zen,Buddhism ");
								    		              System.out.println("=======================================");
								    		              Book b3 = new Religion ("The Way of Zen","Alan W. Watts", 2011, 896);
								    		              b3.detail ();
								    		              System.out.println("Please give a rating out of:");
								    		              System.out.println("Excellent");
								    		              System.out.println("Good");
								    		              System.out.println("Satisfactory");
								    		              System.out.println("Poor");
								    		              String review3 = sc.next();
								    		              b3.setReview(review3);
								    		              System.out.println("Your rating is : " + b3.getReview());
								    		              break; 
							               	   case 4:
							    		              System.out.println("Anger: Wisdom for Cooling the Flamesd, Buddhism ");
							    		              System.out.println("=======================================");
							    		              Book b4 = new Religion ("Anger: Wisdom for Cooling the Flamesd","Thich Nhat Hanh", 2002, 566);
							    		              b4.detail ();
							    		              System.out.println("Please give a rating out of:");
							    		              System.out.println("Excellent");
							    		              System.out.println("Good");
							    		              System.out.println("Satisfactory");
							    		              System.out.println("Poor");
							    		              String review4 = sc.next();
							    		              b4.setReview(review4);
							    		              System.out.println("Your rating is : " + b4.getReview());
							    		             break; 
							               	case 5:
						    		              System.out.println("Silence: The Power of Quiet in a World Full of Noise, Buddhism");
						    		              System.out.println("=======================================");
						    		              Book b5 = new Religion ("Silence: The Power of Quiet in a World Full of Noise","Thich Nhat Hanh", 2015, 696);
						    		              b5.detail ();
						    		              System.out.println("Please give a rating out of:");
						    		              System.out.println("Excellent");
						    		              System.out.println("Good");
						    		              System.out.println("Satisfactory");
						    		              System.out.println("Poor");
						    		              String review5 = sc.next();
						    		              b5.setReview(review5);
						    		              System.out.println("Your rating is : " + b5.getReview());
						    		              break; 
							               		default:
								               		 System.out.println("Choose a correct option to proceed");
										                 break;
								               	         }
								               	         break;
										        	    case 4 :
										        	    	 System.out.println("Books available in Islam: ");
									                	        System.out.println("\n");
									    			            System.out.println("********************************************");
									                	        System.out.println("press 1 for Stories of the Prophets");
									                	        System.out.println("press 2 for The Islam Book: Big Ideas Simply Explained");
									                	        System.out.println("press 3 for The Study Quran");
									                	        System.out.println("press 4 for 365 Sayings of the Quran");
									                	        option= sc.nextInt();
									               	         switch(option) {
									               	      case 1 :
									               	        	System.out.println("Stories of the Prophets,Islam ");
										    		              System.out.println("=======================================");
										    		              Book b1 = new Religion ("Stories of the Prophets","Hafiz Ibn Kathir", 2003, 866);
										    		              b1.detail ();
										    		              System.out.println("Please give a rating out of:");
										    		              System.out.println("Excellent");
										    		              System.out.println("Good");
										    		              System.out.println("Satisfactory");
										    		              System.out.println("Poor");
										    		              System.out.println("Please give a rating out of:");
										    		              System.out.println("Excellent");
										    		              System.out.println("Good");
										    		              System.out.println("Satisfactory");
										    		              System.out.println("Poor");
										    		              String review1 = sc.next();
										    		              b1.setReview(review1);
										    		              System.out.println("Your rating is : " + b1.getReview());
										    		             break; 
									               	      case 2:
									    		              System.out.println("The Islam Book: Big Ideas Simply Explained,Islam");
									    		              System.out.println("=======================================");
									    		              Book b2 = new Religion ("The Islam Book: Big Ideas Simply Explained","DK, Rageh Omaar", 2020, 586);
									    		              b2.detail ();
									    		              System.out.println("Please give a rating out of:");
									    		              System.out.println("Excellent");
									    		              System.out.println("Good");
									    		              System.out.println("Satisfactory");
									    		              System.out.println("Poor");
									    		              String review2 = sc.next();
									    		              b2.setReview(review2);
									    		              System.out.println("Your rating is : " + b2.getReview());
									    		              break; 
								               	      case 3:
									    		              System.out.println("The Study Quran,Islam ");
									    		              System.out.println("=======================================");
									    		              Book b3 = new Religion ("The Study Quran","Seyyed Hossein Nasr", 2015, 786);
									    		              b3.detail ();
									    		              System.out.println("Please give a rating out of:");
									    		              System.out.println("Excellent");
									    		              System.out.println("Good");
									    		              System.out.println("Satisfactory");
									    		              System.out.println("Poor");
									    		              String review3 = sc.next();
									    		              b3.setReview(review3);
									    		              System.out.println("Your rating is : " + b3.getReview());
									    		              break; 
								               	   case 4:
								    		              System.out.println("365 Sayings of the Quran, Islam");
								    		              System.out.println("=======================================");
								    		              Book b4 = new Religion ("365 Sayings of the Quran","Abdur Raheem Kidwai", 2014, 866);
								    		              b4.detail ();
								    		              System.out.println("Please give a rating out of:");
								    		              System.out.println("Excellent");
								    		              System.out.println("Good");
								    		              System.out.println("Satisfactory");
								    		              System.out.println("Poor");
								    		              String review4 = sc.next();
								    		              b4.setReview(review4);
								    		              System.out.println(b4.getReview());
								    		             break;
								               		default:
									               		 System.out.println("Choose a correct option to proceed");
											                 break;
									               	         }
									               	         break;
										        	    case 5:
										        	    	 System.out.println("Books available in Orthodoxy: ");
									                	        System.out.println("\n");
									    			            System.out.println("********************************************");
									                	        System.out.println("press 1 for The Orthodox Way");
									                	        System.out.println("press 2 for Orthodox theology : an introduction");
									                	        System.out.println("press 3 for Angels and Demons: A Catholic Introduction");
									                	        System.out.println("press 4 for Works of Martin Luther. Vol. 1");
									                	        option= sc.nextInt();
									               	         switch(option) {
									               	      case 1 :
									               	        	System.out.println("The Orthodox Way,Orthodoxy");
										    		              System.out.println("=======================================");
										    		              Book b1 = new Religion ("The Orthodox Way","Kallistos Ware", 2003, 586);
										    		              b1.detail ();
										    		              System.out.println("Please give a rating out of:");
										    		              System.out.println("Excellent");
										    		              System.out.println("Good");
										    		              System.out.println("Satisfactory");
										    		              System.out.println("Poor");
										    		              String review1 = sc.next();
										    		              b1.setReview(review1);
										    		              System.out.println("Your rating is : " + b1.getReview());
										    		              break; 
									               	      case 2:
									    		              System.out.println("Orthodox theology : an introduction,Orthodoxy");
									    		              System.out.println("=======================================");
									    		              Book b2 = new Religion ("Orthodox theology : an introduction","Vladimir Lossky", 1978, 686);
									    		              b2.detail ();
									    		              System.out.println("Please give a rating out of:");
									    		              System.out.println("Excellent");
									    		              System.out.println("Good");
									    		              System.out.println("Satisfactory");
									    		              System.out.println("Poor");
									    		              String review2 = sc.next();
									    		              b2.setReview(review2);
									    		              System.out.println("Your rating is : " + b2.getReview());
									    		              break; 
								               	      case 3:
									    		              System.out.println("Angels and Demons: A Catholic Introduction,Orthodoxy");
									    		              System.out.println("=======================================");
									    		              Book b3 = new Religion ("Angels and Demons: A Catholic Introduction","Serge-Thomas Bonino", 2016, 786);
									    		              b3.detail ();
									    		              System.out.println("Please give a rating out of:");
									    		              System.out.println("Excellent");
									    		              System.out.println("Good");
									    		              System.out.println("Satisfactory");
									    		              System.out.println("Poor");
									    		              String review3 = sc.next();
									    		              b3.setReview(review3);
									    		              System.out.println("Your rating is : " + b3.getReview());
									    		              break; 
								               	   case 4:
								    		              System.out.println("Works of Martin Luther. Vol. 1, Orthodoxy");
								    		              System.out.println("=======================================");
								    		              Book b4 = new Religion ("Works of Martin Luther. Vol. 1","Luther Martin.", 2004, 587);
								    		              b4.detail ();
								    		              System.out.println("Please give a rating out of:");
								    		              System.out.println("Excellent");
								    		              System.out.println("Good");
								    		              System.out.println("Satisfactory");
								    		              System.out.println("Poor");
								    		              String review4 = sc.next();
								    		              b4.setReview(review4);
								    		              System.out.println("Your rating is : " + b4.getReview());
								    		             break;
								               		default:
									               		 System.out.println("Choose a correct option to proceed");
											                 break;
									               	         }
									               	        break;
		                	                         	       
										                  default:
										                		System.out.println("Choose a correct option to proceed");
											                    break;			                         		
								                	}
										        	
								                    break;
									               	         
                case 8 :
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                    
                default:
                    System.out.println("Choose a correct option to proceed");
                    break;
            }

        }while( option!= 8 );	        
        System.out.println("Thanks for visiting The Big Bookstore.");
	}
}
class Book
{
	String name;
	String authname;
	int year;
	double price;
	private String review;
	public String getReview()
	{
		return review;
	}
	public void setReview (String review)
	{
		this.review=review;
	}
	public void detail()
	{
		System.out.println("Book name: "+this.name);
		System.out.println("Author name: "+this.authname);
		System.out.println("Year: "+this.year);
		System.out.println("Price: "+ this.price);
		System.out.println("Thank you for buying " + this.name + " book :)");
	}
}
	class Comics extends Book
	{
	Comics(String name, String authname, int year, double price)
	{
		this.name=name;
		this.authname=authname;
		this.year=year;
		this.price=price;
	}
	}
	class Crime extends Book
	{
		Crime(String name, String authname, int year, double price)
		{
			this.name=name;
			this.authname=authname;
			this.year=year;
			this.price=price;
		}
	}
	class Fiction extends Book
	{
		Fiction(String name, String authname, int year, double price)
		{
			this.name=name;
			this.authname=authname;
			this.year=year;
			this.price=price;
		}
	}
	class Children extends Book
	{
		Children(String name, String authname, int year, double price)
		{
			this.name=name;
			this.authname=authname;
			this.year=year;
			this.price=price;
		}
	}
	class Biography extends Book
	{
		Biography (String name, String authname, int year, double price)
		{
			this.name=name;
			this.authname=authname;
			this.year=year;
			this.price=price;
		}
	}
class Religion extends Book
{
	Religion (String name, String authname, int year, double price)
	{
		this.name=name;
		this.authname=authname;
		this.year=year;
		this.price=price;
	}
}
class SelfHelp extends Book
{
	SelfHelp(String name, String authname, int year, double price)
	{
		this.name=name;
		this.authname=authname;
		this.year=year;
		this.price=price;
	}
}






 
