import java.util.Random;
public class Blackjack{
	public static void main(String[] args){
		String[] newDeck = deckCreator(5);
		print(newDeck);
	}
	public static String[] deckCreator(int numDecks){
		String[] suits = {"S", "C", "H", "D"};
		String[] deck = new String[52*numDecks];
		String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k", "a"};
		int index = 0;
		for (int k = 0; k < numDecks; k++){
			for (int i = 0; i < value.length; i++){
				for (int j = 0; j < 4; j++){
					deck[index] = value[i] + suits[j];
					index++;
				}
			}
		}
		for (int v = 0; v < 5; v++){
			deckShuffler(deck);
		}
		return deck;
	}

	public static void print(String[] arr){
		for (int i = 0; i < arr.length; i++){
			if (i == arr.length - 1){
				System.out.print(arr[i]);
			}
			else{
				System.out.print(arr[i] + ", ");
			}
		}
	}
	public static void deckShuffler(String[] arr){
		Random rand = new Random();
		String storage = "";
		for (int i = 0; i < arr.length; i++){
			int randomPos = rand.nextInt(arr.length);
			storage = arr[i];
			arr[i] = arr[randomPos];
			arr[randomPos] = storage;
		}
	}
}