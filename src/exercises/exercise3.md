# Exercise 

Run **only** the test method `givenColorPurple_whenInvokingDeleteByColorPurple_thenAllFlowersWithColorPurpleAreRemoved`

As you can see, there is no implementation yet...
- Implement both the test method and the code so that the test method doesn't fail anymore.
  - Start with implementing the test method, it should fail since the delete method is not yet implemented.
  - Now implement the endpoint
    - This endpoint should:
      - use a path variable "color", which is the color you want to delete all flowers for
      - return the remaining flowers (in all other colors) in json format
    - Tip: you need to use Iterator when deleting elements from a list you are looping over in Java. See https://www.w3schools.com/java/java_iterator.asp
