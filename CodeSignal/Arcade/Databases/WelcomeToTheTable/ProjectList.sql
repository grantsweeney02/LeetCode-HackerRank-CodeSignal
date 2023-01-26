CREATE PROCEDURE solution()
BEGIN
	SELECT project_name, team_lead, income from Projects order by internal_id;
END