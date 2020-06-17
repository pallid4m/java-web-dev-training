package edu.training.string.basic;

public class Main {

    public static void main(String[] args) {

    }

//    task 1
    public static String separatedEvenOddSymbol(String string) {
        StringBuilder evenStringBuilder = new StringBuilder();
        StringBuilder oddStringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if ((i + 1) % 2 != 0) {
                oddStringBuilder.append(ch);
            } else {
                evenStringBuilder.append(ch);
            }
        }
        return String.format("odd string: %s\neven string: %s\n", oddStringBuilder, evenStringBuilder);
    }

//    task 2
    public static String printPercentLowerUpperCase(String string) {
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    lowerCaseCount++;
                } else {
                    upperCaseCount++;
                }
            }
        }
        double percentLowerCase = (double) lowerCaseCount / string.length() * 100;
        double percentUpperCase = (double) upperCaseCount / string.length() * 100;
        return String.format("lower case percent: %.2f\nupper case percent: %.2f\n", percentLowerCase, percentUpperCase);
    }

//    task 3
    public static String deleteSameCharacter(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char firstChar = string.charAt(0);
        stringBuilder.append(firstChar);
        for (int i = 1; i < string.length(); i++) {
            char nextChar = string.charAt(i);
            boolean isSameChar = false;
            for (int j = 0; j < stringBuilder.length(); j++) {
                char ch = stringBuilder.charAt(j);
                if (ch == nextChar) {
                    isSameChar = true;
                    break;
                }
            }
            if (!isSameChar) {
                stringBuilder.append(nextChar);
            }
        }
        return stringBuilder.toString();
    }

//    task 4
    public static int characterFrequency(String string, char ch) {
        int charFrequency = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                charFrequency++;
            }
        }
        return charFrequency;
    }

//    task 5
    public static String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

//    task 6
    public static String insertSubstring(String src, String dest, int pos) {
        StringBuilder stringBuilder = new StringBuilder(src);
        stringBuilder.insert(pos, dest);
        return stringBuilder.toString();
    }

//    task 7
    public static String deleteSubstring(String string, String dest) {
        StringBuilder stringBuilder = new StringBuilder(string);
        int startIndex = stringBuilder.indexOf(dest);
        int endIndex = startIndex + dest.length();
        stringBuilder.delete(startIndex, endIndex);
        return stringBuilder.toString();
    }

//    task 8
    public static String copyPartString(String string, int offset, int count) {
        char[] data = string.toCharArray();
        return String.copyValueOf(data, offset, count);
    }

//    task 9
    public static int length(String string) {
        return string.length();
    }

//    task 10
    public static int substringCount(String string, String substring) {
        String pureString = string.replace(substring, "");
        return (string.length() - pureString.length()) / substring.length();
    }

//    task 11
    public static void printReversedWord(String string) {
        String[] words = string.split("\\W+");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }

//    task 12
    public static String replaceSpaceCharacter(String string) {
        return string.replaceAll("\\s+", "*");
    }

//    task 13
    public static String replaceCharacter(String string) {
        String[] words = string.split("\\W+");
        String maxWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }
        String newWord = maxWord.replace('a', 'b');
        return string.replace(maxWord, newWord);
    }

//    task 14
    public static int minWordLength(String string) {
        String[] words = string.split("\\W+");
        int minWordLength = words[0].length();
        for (int i = 1; i < words.length; i++) {
            int wordLength = words[i].length();
            if (wordLength < minWordLength) {
                minWordLength = wordLength;
            }
        }
        return minWordLength;
    }

//    task 15
    public static int countWord(String string) {
        String[] words = string.split("\\W+");
        return words.length;
    }

//    task 16
    public static String swapWord(String string, String firstWord, String secondWord) {
        StringBuilder stringBuilder = new StringBuilder(string);
        int fromIndex = 0;
        int firstWordIndex = 0;
        int secondWordIndex = 0;

        while (firstWordIndex != -1 && secondWordIndex != -1) {
            firstWordIndex = stringBuilder.indexOf(firstWord, fromIndex);
            secondWordIndex = stringBuilder.indexOf(secondWord, fromIndex);
            if ((firstWordIndex < secondWordIndex || secondWordIndex == -1) && firstWordIndex != - 1) {
                stringBuilder.replace(firstWordIndex, firstWordIndex + firstWord.length(), secondWord);
                fromIndex = firstWordIndex + secondWord.length();
            } else if (secondWordIndex != - 1) {
                stringBuilder.replace(secondWordIndex, secondWordIndex + secondWord.length(), firstWord);
                fromIndex = secondWordIndex + firstWord.length();
            }
        }
        return stringBuilder.toString();
    }

//    task 17
    public static String deleteLastWord(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        int start = 0;
        int end = 0;
        boolean isWord = false;
        for (int i = string.length() - 1; i >= 0; i--) {
            char ch = string.charAt(i);
            if (Character.isLetter(ch)) {
                if (!isWord) {
                    end = i + 1;
                    isWord = true;
                }
            } else if (isWord) {
                start = i + 1;
                break;
            }
        }
        stringBuilder.delete(start, end);
        return stringBuilder.toString();
    }

//    task 18
    public static String insertSpace(String string, int offset, int count) {
        String spaceString = " ".repeat(count);
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.insert(offset, spaceString);
        return stringBuilder.toString();
    }

//    task 19
    public static boolean isPalindrome(String string) {
        String lowerCaseString = string.toLowerCase();
        for (int i = 0, j = lowerCaseString.length() - 1; i < lowerCaseString.length() / 2; i++, j--) {
            if (lowerCaseString.charAt(i) != lowerCaseString.charAt(j)) {
                return false;
            }
        }
        return !lowerCaseString.isBlank();
    }

//    task 20
    public static String replaceSubstring(String string, int start, int end, String replacement) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.replace(start, end, replacement);
        return stringBuilder.toString();
    }

//    task 21
    public static String longSum(String firstNumber, String secondNumber) {
        StringBuilder longNumberString = new StringBuilder();
        char firstChar, secondChar;
        int firstDigit, secondDigit;
        int digitSum = 0;
        int overflow = 0;
        for (int i = firstNumber.length() - 1, j = secondNumber.length() - 1; i >= 0 || j >= 0; i--, j--) {
            if (i >= 0) {
                firstChar = firstNumber.charAt(i);
                firstDigit = Character.digit(firstChar, 10);
                digitSum += firstDigit;
            }
            if (j >= 0) {
                secondChar = secondNumber.charAt(j);
                secondDigit = Character.digit(secondChar, 10);
                digitSum += secondDigit;
            }
            digitSum += overflow;
            if (digitSum > 9) {
                overflow = 1;
                longNumberString.append(digitSum - 10);
            } else {
                overflow = 0;
                longNumberString.append(digitSum);
            }
            digitSum = 0;
        }
        if (overflow > 0) {
            longNumberString.append(overflow);
        }
        return longNumberString.reverse().toString();
    }

//    task 22
    public static String deleteWord(String string, int wordLength) {
        String[] words = string.split("\\W+");
        for (String word : words) {
            if (word.length() == wordLength) {
                string = string.replaceFirst(word, "");
            }
        }
        return string;
    }

//    task 23
    public static String deleteExtraSpace(String string) {
        string = string.replaceAll("(\\s){2,}", "$1");
        return string.strip();
    }

//    task 24
    public static void printWords(String string) {
        String[] words = string.split("\\W+");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
