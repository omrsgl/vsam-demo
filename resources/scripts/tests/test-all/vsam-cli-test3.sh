echo Test 3 Started!
../.././olvsam.sh -record -list

../.././olvsam.sh -record -add -lf ../../../cpy/F5750024.cpy -hdr ../../../cpy/F5750HIS.cpy -id 024C -redefines string
../.././olvsam.sh -record -add -lf ../../../cpy/F5750025.cpy -hdr ../../../cpy/F5750HIS.cpy -id 025C -redefines string
../.././olvsam.sh -record -add -lf ../../../cpy/F5750040.cpy -hdr ../../../cpy/F5750HIS.cpy -id 040C -redefines string
../.././olvsam.sh -record -add -lf ../../../cpy/F5750044.cpy -hdr ../../../cpy/F5750HIS.cpy -id 044C -redefines string

../.././olvsam.sh -record -list
echo Test 3 Ended!
echo ---------------------------------------------------------------