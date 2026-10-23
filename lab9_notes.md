first task is done  , after clean build  is ; Reusing configuration cache.
> Task :app:clean

BUILD SUCCESSFUL in 242ms
1 actionable task: 1 executed
Configuration cache entry reused.
and after rebuilding the project is ; BUILD SUCCESSFUL in 2s
36 actionable tasks: 36 executed
Configuration cache entry reused.
for incrimental after I did a small change in the code and rebuild the project is ; BUILD SUCCESSFUL in 912ms
36 actionable tasks: 5 executed, 31 up-to-date
answer to q one ; Which module should know the least about the others, and which the most?
the book class should know the least about the others,it depends on nothing and the app should know the most about the others.wires everything together. 
for task 2 I ve added versions on version catalog ; 
- Added versions: navigationCompose, coroutines
- Added libraries: lifecycle-viewmodel-compose, lifecycle-viewmodel-savedstate,
  lifecycle-runtime-compose, navigation-compose, kotlinx-coroutines-core,
  kotlinx-coroutines-test
- Reflection: two different versions of the same lib → Gradle forces one (usually highest),
  risking NoSuchMethodError / untested behavior. Catalog keeps only one version for all. 