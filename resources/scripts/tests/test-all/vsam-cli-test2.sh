echo Test 2 Started!
../.././olvsam.sh -record -list

../.././olvsam.sh -record -remove F5750025
../.././olvsam.sh -record -remove F5750040
../.././olvsam.sh -record -remove F5750044

../.././olvsam.sh -record -list
echo Test 2 Ended!
echo ---------------------------------------------------------------