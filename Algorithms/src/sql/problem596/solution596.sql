Input:
Courses table:
+---------+----------+
| student | class    |
+---------+----------+
| A       | Math     |
| B       | English  |
| C       | Math     |
| D       | Biology  |
| E       | Math     |
| F       | Computer |
| G       | Math     |
| H       | Math     |
| I       | Math     |
+---------+----------+
Output:
+---------+
| class   |
+---------+
| Math    |
+---------+
Explanation:
- Math has 6 students, so we include it.
- English has 1 student, so we do not include it.
- Biology has 1 student, so we do not include it.
- Computer has 1 student, so we do not include it.


<!--Cok basit bir sorguydu ancak HAVING fonksiyonunu daha once kullanmamistim. -->
<!-- Bu sebepten bir tik uzun surdu ama HAVING'in GROUP BY sorgularinda gruplandirdiklarimizin kosullarini verirken -->
  <!--kullanildigini ogrenmis oldum-->

<!-- Solution Code Here-->

SELECT class FROM Courses GROUP BY class HAVING COUNT(class) >= 5;