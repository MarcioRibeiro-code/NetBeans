//#include <cs50.h>
#include <ctype.h>
#include <stdio.h>
#include <string.h>

#define LOWER 97
#define UPPER 65

int main(int argc, char *argv[]) {
  char *string = *argv;
  int size = strlen(string);
  char chiper[size];

  int pos = 0;

  for (int i = 0; i < size; i++) {
    if (isupper(string[i])) {
      chiper[pos++] = (((string[i] - UPPER) + argc) % 26) + UPPER;
    } else {
      chiper[pos++] = (((string[i] - LOWER) + argc) % 26) + LOWER;
    }
  }
  printf("%s",chiper);
}