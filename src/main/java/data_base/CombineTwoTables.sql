--Combine Two Tables
select p.firstName, p.lastName, a.city, a.state from Person p left join Address a on a.personId = p.personId
select firstName, lastName, city, state from Person left join Address using(personId)