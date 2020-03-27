# troweprice-test

## What?

Provides StringUtils utility class with 2 methods 

findLongestWordAndWordLength(String sentence) - returns longest word and its length in the sentence 

findShortestWordAndWordLength(String sentence) - returns shortest word and its length in the sentence 


### How to Run Tests?

```
./gradlew clean test -i 
```


Produces test report here - ./build/reports/tests/test/index.html



### Assumptions Made

* If input sentence param is null or empty, method returns IllegalArgumentException 

* When more than one longest or shortest words are found in the sentence, first match will be returned

* Extra spaces between words will be normalised to one space, so space will not be treated as a word

* Punctuations comma, full stop, semicolon are not considered as part of a word   
