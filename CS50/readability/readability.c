//#include <cs50.h>
#include <stdio.h>
#include <string.h>

int calc_index(char *string);

int main(void) {

  char *string =
      "As the average number of letters and words per sentence increases, the "
      "Coleman-Liau index gives the text a higher reading level. If you were "
      "to take this paragraph, for instance, which has longer words and "
      "sentences than either of the prior two examples, the formula would give "
      "the text an twelfth-grade reading level.";

  int grade = calc_index(string);
  printf("Grade %i", grade);
}

int calc_index(char *string) {

  float L, S;
  float sentence = 0;
  float word = 1;
  float letter = 0;

  for (int i = 0; i < strlen(string); i++) {
    if (string[i] == 39) {
      continue;
    }

    if (string[i] == '.' || string[i] == '!' || string[i] == '?') {
      sentence++;
    } else if (string[i] == ' ') {
      word++;
    } else {
      letter++;
    }
  }

  printf("WORD: %f\n", word);
  printf("letter: %f\n", letter);
  printf("Sentence: %f\n", sentence);

  L = (letter / word) * 100;
  S = (sentence / word) * 100;

  printf("L %f\n", L);
  printf("S %f\n", S);

  return 0.0588 * L - 0.296 * S - 15.8;
}