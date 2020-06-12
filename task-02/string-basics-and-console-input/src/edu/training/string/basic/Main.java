package edu.training.string.basic;

public class Main {

    public static void main(String[] args) {
        String string = "hELlo, jAva WoRld!";
    }

//    task 1
    public static void separateEvenOddSymbol(String string) {
        StringBuilder evenStringBuilder = new StringBuilder();
        StringBuilder oddStringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if ((i + 1) % 2 != 0) {
                evenStringBuilder.append(ch);
            } else {
                oddStringBuilder.append(ch);
            }
        }
        System.out.printf("even string: %s; odd string: %s\n", evenStringBuilder, oddStringBuilder);
    }

//    task 2
    public static void printPercentLoweUpperCase(String string) {
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
        System.out.printf("percent1: %.2f; percent2: %.2f\n", percentLowerCase, percentUpperCase);
    }

//    task 3
    public static String deleteSameCharacter(String string) {
        char firstChar = string.charAt(0);
        StringBuilder stringBuilder = new StringBuilder(firstChar);
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
        int start = stringBuilder.indexOf(dest);
        int end = dest.length();
        stringBuilder.delete(start, end);
        return stringBuilder.toString();
    }

//    task 8
    public static String copyStringPart(String string, int offset, int count) {
        char[] data = string.toCharArray();
        return String.copyValueOf(data, offset, count);
    }

//    task 9
    public static int getStringLength(String string) {
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
    public static String replaceSpaceCharacters(String string) {
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
        return maxWord.replace('a', 'b');
    }

//    task 14
    public static int getMinWordLength(String string) {
        String[] words = string.split("\\W+");
        String minWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < minWord.length()) {
                minWord = words[i];
            }
        }
        return minWord.length();
    }

//    task 15
    public static int countWord(String string) {
        String[] words = string.split("\\W+");
        return words.length;
    }

//    task 16
    public static String swapWord(String string, int firstWord, int secondWord) {
        String[] words = string.split("\\W+");

        String swapWord = words[firstWord];
        words[firstWord] = words[secondWord];
        words[secondWord] = swapWord;

        StringBuilder wordStringBuilder = new StringBuilder();
        for (String word : words) {
            wordStringBuilder.append(word);
        }
        return wordStringBuilder.toString();
    }

//    task 17
    public static String deleteLastWord(String string) {
        String[] words = string.split("\\W+");
        StringBuilder wordStringBuilder = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            wordStringBuilder.append(words[i]);
        }
        return wordStringBuilder.toString();
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
        int halfLength = string.length() / 2;
        String leftPeacePalindrome = lowerCaseString.substring(0, halfLength);
        String rightPeacePalindrome = lowerCaseString.substring(halfLength + 1);
        rightPeacePalindrome = new StringBuilder(rightPeacePalindrome).reverse().toString();
        return leftPeacePalindrome.equals(rightPeacePalindrome);
    }

//    task 20
    public static String replaceSubstring(String string, String substring, String replacement) {
        return string.replace(substring, replacement);
    }

//    task 21
    public static String add(String firstNumber, String secondNumber) {
        char firstChar, secondChar;
        int firstDigit, secondDigit;
        int digitSum = 0;
        int shift = 0, single;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = firstNumber.length() - 1, j = secondNumber.length() - 1; i >= 0 && j >= 0; i--, j--) {
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
            digitSum += shift;
            if (digitSum > 9) {
                shift = digitSum / 10;
                single = digitSum - 10;
                stringBuilder.append(single);
            } else {
                shift = 0;
                stringBuilder.append(digitSum);
            }
        }
        if (shift > 0) {
            stringBuilder.append(shift);
        }
        return stringBuilder.reverse().toString();
    }

//    task 22
    public static String deleteWord(String string, int wordLength) {
        String[] words = string.split("\\W+");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            if (word.length() != wordLength) {
                stringBuilder.append(word);
            }
        }
        return stringBuilder.toString();
    }

//    task 23
    public static String trim(String string) {
        return string.trim();
    }

//    task 24
    public static String[] getWords(String string) {
        return string.split("\\W+");
    }
}
