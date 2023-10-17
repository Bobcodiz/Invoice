(deftemplate potato
  (slot leaves(type STRING))
  (slot stems(type STRING))
  (slot roots(type STRING))
)

(defrule menu1
    =>
    (printout t "Does the disease affect the leaves?
    if yes enter 1 if no enter 0" crlf)
    (printout t "Choice : ")
    (bind ?leaves (read))
    (assert (leaves ?leaves))
)

(defrule late-blight
    (leaves 1)
    =>
    (printout t "---late blight---
    1.Small, dark, water-soaked lesions on the leaves.
    2.Lesions have an irregular, often angular shape.
    3.Lesions can range from dark green to brown.
    4.Often surrounded by a pale green to yellow halo.
    5.Development of white, fuzzy or cottony growth on the undersides of the leaves.
    6.Dark lesions on stems and petioles.
    7.Foul, earthy odor in humid conditions.
    8.Rapid spread in cool, wet conditions.
    9.Leaf curling and defoliation as the disease progresses"crlf)
    

    (printout t"Enter 1 if your plant has the above symptoms and 0 for next symptoms" crlf)
    (printout t "Choice : ")
    (bind ?leaves (read))
    (assert (leaves ?leaves))

)
(defrule early-blight
      (leaves 1)
         =>
         (printout t "---early blight---
              1. Dark, target-like concentric rings with a yellow halo on older leaves.
              2. Irregularly shaped brown lesions with dark centers on lower leaves.
              3. Premature defoliation, reducing yield and tuber quality"crlf)

              (printout t"Do you observe the above Symptoms?
              If Yes Enter 1 if No Enter 0" crlf)
              (printout t "Choice: ")
              (bind ?leaves (read))
              (assert (leaves ?leaves))
)

(defrule Black-dot
    (leaves 1)
    =>
    (printout t"---black dots---
              1.Small, dark brown to black spots on leaves.
              2.Lesions often have a depression or  in the center.
              3.Premature leaf drop and reduced tuber quality.
    "crlf)
    (printout t"Do you observe the above symptoms?
    If ye enter 1 If no enter 0"crlf)
    (printout t"choice: ")
    (bind ?leaves (read))
    (assert (leaves ?leaves))
)

(defrule common-scab
    (leaves 1)
    =>
    (printout t"---common scab---
        1.Lesions on leaves are less common, but they may appear as small, dark spots or raised blemishes.
        2.The primary damage from common scab is usually seen on the tubers, not the leave"crlf)
    (printout t"Do you observe the above signs?
                If yes Enter 1 If no Enter 0"crlf)
    (printout t"Choice: ")
    (bind ?leaves (read))
    (assert (leaves ?leaves))
)

(defrule Eary-Dying-Syndrome
    (leaves 1)
    =>
    (printout t"---early dying syndrome---
        1.Yellowing, wilting, and browning of leaves starting at the lower part of the plant.
        2.Leaflets often die from the tip inward.
        3.Premature defoliation, impacting the plant's ability to produce tubers."crlf)

    (printout t"If you observe the above symptoms Enter 1 If not Enter 0"crlf)
    (printout t"Choice: "crlf)
    (bind ?leaves(read))
    (assert (leaves ?leaves))
)

(defrule Powdery-Mildew
    (leaves 1)
    =>
    (printout t"---powdery mildew---
        1.White, powdery spots or patches on the upper surface of leaves.
        2.Leaves may become distorted or curl as the infection progresses.
        3.Reduced photosynthesis and yield."crlf)
    (printout t"If you observe the above symptoms Enter 1 If not Enter 0"crlf)
    (printout t"Choice:"crlf)
    (bind ?leaves (read))
    (assert (leaves ?leaves))
)
(defrule leaf-roll
    (leaves 1)
    =>
    (printout t"---leaf roll---
        1.Affected leaves may curl or roll upward.
        2.Veins may become prominent.
        3.Stunted plant growth, and reduced tuber size and yield"crlf)

    (printout t"If you observe These signs enter 1 If not enter 0"crlf)
    (printout t"Choice"crlf)
    (bind ?leaves(read))
    (assert(leaves ?leaves))
)

(defrule Menu2
    =>
    (printout t"Does the desease affect the Stem?"crlf)
    (printout t"If yes enter 1 if no enter 0"crlf)
    (printout t"Choice:"crlf)
    (bind ?stems(read))
    (assert (stems ?stems))

)
(defrule Blackleg
    (stems 1)
    =>
    (printout t"---black leg---
        1.Black, slimy rot near the base of stems.
        2.Wilting, yellowing, and collapsing of the affected stems.
        3.Infected stems may have a foul odor.
        4.The bacteria can also spread to tubers during harvest."crlf)
    (printout t"If you Notice the above enter 1 if not Enter 0"crlf)
    (printout t"Choice: "crlf)
    (bind ?stems(read))
    (assert (stems ?stems))
)
(defrule Soft-rot
    (stems 1)
    =>
    (printout t"---soft rot---
        1.Soft, watery, and mushy rot of stems, typically starting at the base.
        2.Foul odor from affected stems.
        3.Infected stems may turn dark and eventually disintegrate."crlf)
    (printout t"If you notice the above problems Enter 1 If not Enter 0"crlf)
    (printout t"Choice:"crlf)
    (bind ?stems(read))
    (assert (stems ?stems))
)
(defrule Rhizoctonia-Stem-Cancer
    (stems 1)
    =>
    (printout t"---rhizoctionia stem cancer---
        1.Dark, sunken cankers or lesions on stems near the soil line.
        2.Cankers may have a reddish-brown border and a tan to gray center.
        3.Stems can become girdled and weakened, leading to wilting and lodging."crlf)
   (printout t"If you notice the above signs Enter 1 If not Enter 2"crlf)
   (printout t"Choice:"crlf)
   (bind ?stems(read))
   (assert (stems ?stems))
)
(defrule Menu3
    =>
    (printout t"Does the disease affect the roots?"crlf)
    (printout t"If yes Enter 1 if No Enter 0"crlf)
    (printout t"Choice : "crlf)
    (bind ?roots(read))
    (assert (roots ?roots))
)
(defrule Rhizoctonia-Root-Rot
    (roots 1)
    =>
    (printout t"---rhizoctionia root rots---
        1.Brown to black lesions on the roots, often near the tips.
        2.Affected roots may be constricted and have a wrinkled appearance.
        3.Reduced root development and nutrient uptake."crlf)
    (printout t"If you notice the Above Enter 1 If not Enter 0"crlf)
    (printout t"Choice: "crlf)
    (bind ?roots(read))
    (assert (roots ?roots))
)
