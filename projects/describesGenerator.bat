cls
del describesMM.txt
for /D %%J in (".\*") do (
  echo %%J >> describesMM.txt
  more %%J\describe.txt >> describesMM.txt
  dir /b /s %%J\target\classes\*.class >> describesMM.txt
  echo - >> describesMM.txt
)
start "" "describesMM.txt"
close