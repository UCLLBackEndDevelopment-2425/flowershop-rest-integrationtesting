# Exercise 

Run **only** the test method `givenColorPurple_whenInvokingDeleteByColorPurple_thenAllFlowersWithColorPurpleAreRemoved`

As you can see, it also fails :-)
- Why does it fail?
- Implement both the test method and the code so that the test method doesn't fail anymore.
  - Tip: use Iterator when deleting in a list. https://www.w3schools.com/java/java_iterator.asp
  - This end-point should 
    - should use a path variable color, which is the color of which you want to delete all flowers of
    - return the remaining flowers (in all other colors) in json format
  - In the test method also check that there will be thrown an exception when you check if there are still flowers of the color you picked to be deleted (purple in this case)