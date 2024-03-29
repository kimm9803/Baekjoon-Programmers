-- 코드를 입력하세요
SELECT
    AIN.NAME, AIN.DATETIME
FROM
    ANIMAL_INS AIN
LEFT JOIN ANIMAL_OUTS AOUT ON
    AOUT.ANIMAL_ID = AIN.ANIMAL_ID
WHERE
    AOUT.ANIMAL_ID IS NULL
ORDER BY
    AIN.DATETIME ASC
LIMIT 3;