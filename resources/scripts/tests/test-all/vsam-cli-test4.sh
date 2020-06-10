echo Test 4 Started!
../.././olvsam.sh -file -list

../.././olvsam.sh -file -remove AAVSAMML
../.././olvsam.sh -file -remove AAVS40ML
../.././olvsam.sh -file -remove AAVS50ML
../.././olvsam.sh -file -remove AAVS51ML

../.././olvsam.sh -file -list
echo Test 4 Ended!
echo ---------------------------------------------------------------