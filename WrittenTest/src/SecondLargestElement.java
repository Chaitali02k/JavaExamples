
public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Second Largest num is:" + secondLargest(new int[] { 45, 51, 28, 75, 49, 42 }));

	}

	private static int secondLargest(int[] numbers) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < numbers.length; i++) {
		
			for (int j = i + 1; j < numbers.length; j++) {
			
				if (numbers[i] > numbers[j]) {
					
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;

				}
			}

		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		return numbers[0];
	}

}
