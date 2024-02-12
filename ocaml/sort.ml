(* FILEPATH: /Users/rinareimer/Desktop/coding-projects/sorting-algorithms/ocaml/sort.ml *)

(* takes a list of integers and that returns whether or not the list is in sorted (nondecreasing) order*)
let rec is_sorted(lst) =
  match lst with
  | [] -> true
  | [x] -> true
  | x::y::ys -> if x > y then false
                  else is_sorted(y::ys)

(** INSERTION SORT *)                  
(* take an int and a sorted (nondecreasing) int list as parameters and that returns the list obtained by inserting the int into the list so as to preserve sorted order *)
let rec insert(n, lst) =
  match lst with
  | [] -> [n]
  | x::xs -> if x > n then n::x::xs
             else x::insert(n,xs)
(* takes an int list as a parameter and that returns the list obtained by sorting the list into nondecreasing order *)
let rec isort(lst) = 
  match lst with
  | [] -> []
  | x::xs -> insert(x, isort(xs))

(** QUICK SORT *)
let rec qsort(less, lst) =
    match lst with
    | []          -> []
    | pivot::rest ->
        let rec split(lst1, lst2, lst3) =
            match lst1 with
            | []    -> qsort(less, lst2) @ [pivot] @ qsort(less, lst3)
            | x::xs -> if less(x, pivot) then split(xs, x::lst2, lst3)
                       else split(xs, lst2, x::lst3)
        in split(rest, [], [])