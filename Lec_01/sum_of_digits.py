"""
Problem: Find the sum of digits of a given number.

Example:
Input: 1234
Output: 10 (1 + 2 + 3 + 4)

Time Complexity: O(log10(n)) where n is the absolute value of the number
Space Complexity: O(1)
"""

def calculate_digit_sum(n: int) -> int:
    """Calculates and returns the sum of digits of integer n."""
    n = abs(n)
    total_sum = 0

    while n > 0:
        total_sum += n % 10
        n //= 10

    return total_sum


def main():
    try:
        user_input = int(input("Enter an integer: ").strip())
        result = calculate_digit_sum(user_input)
        print(f"Sum of digits of {user_input} is: {result}")
    except ValueError:
        print("Invalid input! Please enter a valid integer.")


if __name__ == "__main__":
    main()
