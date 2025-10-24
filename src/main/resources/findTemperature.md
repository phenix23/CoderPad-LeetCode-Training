Your company builds temperature captors for freezers. These
captors records temperature periodically and put the last values in a
list. You have to develop the algorithm displaying the unique
temperature that is supposed to sum up these values.

You know the captors are not reliable at all, so you decide to
display the most expected temperature among the ones in the list, which
is the one closest to zero.

[](https://d1sxk9v5q9mvr.cloudfront.net/work/servlet/fileservlet?id=1728588048)

Sample temperatures. Here, -1.7 is the closest to 0.

Implement the method `closestToZero(ts)`.

- the list `ts` is always defined (no null, None or any other value like that),
- `ts` can be empty, in that case, return the value 0 (zero),
- If two numbers in `ts` are as close to zero, consider the positive number as the closest (eg. if `ts` contains -5 and 5, return 5),
- The temperatures are always expressed with decimal numbers ranging from -273.0 to 5526.0.

---

You need help?

[Check out some solutions from the community.](https://files.codingame.com/pub/temps.html)

*Note: this help
link is provided because you are currently viewing a question of the
trial mode which should not be used to assess real candidates. Such
links are not available for questions of paying plans.*

Implementation

Function

Implement  the method closestToZero.

Parameters

ts (List<Double>): the temperatures measured by the captor.

Return value

resultTemp (double): the temperature closest to zero.

Constraints

length(ts)  <= 20

Available RAM: 512MB

Timeout: 1 second