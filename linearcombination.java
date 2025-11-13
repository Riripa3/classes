//span
/*Imagine these vectors:

cheese
sauce
veggies

You can make different pizzas using linear combinations:

2 × cheese + 1 × sauce  
1 × cheese + 5 × veggies  
10 × sauce + 0 × veggies  


The set of all pizzas you can make
using these ingredients is the span. */

//************************************************ *************/

//linear combination
/* Imagine you’re making a pizza.

Vector v₁ = cheese
Vector v₂ = sauce
Vector v₃ = veggies

You can create different pizzas by choosing how much of each ingredient to add:
2 × cheese + 1 × sauce + 0 × veggies
Or
1 × cheese + 3 × sauce + 2 × veggies
These different mixtures are your linear combination
 */

//***************************************************************************** */

//=> dependent and independent
/*
 Take these two vectors:

v₁ = (1,0)
v₂ = (0,1)
Can you build v₂ from v₁?
No — because v₁ only goes right, v₂ only goes up.
They are independent ✔️

Now try this:
v₁ = (1,2)
v₂ = (2,4)
v₂ is exactly 2 × v₁:
(2,4) = 2 × (1,2)
So you can build v₂ using v₁.
That means:
v₂ is NOT special
v₂ is DEPENDENT

They are dependent vectors ❌

🧠 Why this matters

Being “dependent” means:
Something is repeated
It doesn’t add new direction
It doesn’t expand the span

Being “independent” means:
You get a new direction
You expand the space you can reach
 */
//******************************************************************** */
 /*
⭐ The 4 standard basis vectors in R⁴ are:
👉 e₁ = (1, 0, 0, 0)
👉 e₂ = (0, 1, 0, 0)
👉 e₃ = (0, 0, 1, 0)
👉 e₄ = (0, 0, 0, 1)
  */
//********************************************************************* */
/*
⭐ So normalization changes:
✔️ The length (magnitude)

It becomes exactly 1.
❌ NOT the direction

The arrow still points in the same direction, just shorter or longer.
*/

//*********************************************************************************** */

/*
A convex combination of two points 
𝐴
A and 
𝐵
B is any point you get by mixing them with non-negative weights that add up to 1.
It looks like:

  
𝑃=𝛼𝐴+(1−𝛼)𝐵where 0≤𝛼≤1.
Examples
=>0.3A+0.7B → convex (0.3≥0, 0.7≥0, sum=1).
=>1A+0B → convex (endpoint )
=>0A+1B → convex (endpoint )
=>1.2A−0.2B → not convex (negative weight).
=>0.5A+0.6B → not convex (weights sum to 1.1 ≠ 1).
=>−1A+2B → not convex (negative weight for A).

 */

 //******************************************************************************* */
 /*✔️ The coefficients add up to 1
❌ Coefficients can be positive OR negative

(That’s the difference from a convex combination.)

⭐ Quick examples:
✔️ Affine combinations
2A−1B → 
2+(−1)=1 ✔
−3A+4B → 
−3+4=1 ✔
0.3A+0.7B → 
0.3+0.7=1 ✔ (also convex)

❌ Not affine combinations


0.3A+0.6B →
0.3+0.6=0.9 ❌
A+B → 
1+1=2 ❌
−2A+5B → 
−2+5=3 ❌
 */

 //******************************************************************************** */
 