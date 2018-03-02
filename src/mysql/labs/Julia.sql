SELECT sakila.actor.first_name, sakila.actor.last_name, sakila.film_actor.actor_id, sakila.film.title
FROM (sakila.film_actor INNER JOIN sakila.actor ON sakila.film_actor.actor_id = sakila.actor.actor_id)
INNER JOIN sakila.film ON (sakila.film_actor.film_id = sakila.film.film_id)
WHERE first_name = 'Julia' AND last_name = 'McQueen';
