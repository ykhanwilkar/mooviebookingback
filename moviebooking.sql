--
-- PostgreSQL database dump
--

-- Dumped from database version 13.3
-- Dumped by pg_dump version 13.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: cinema_halls; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cinema_halls (
    cinema_hall_id integer NOT NULL,
    hall_addr character varying(255),
    hall_name character varying(255),
    city_id integer NOT NULL
);


ALTER TABLE public.cinema_halls OWNER TO postgres;

--
-- Name: cities; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cities (
    city_id integer NOT NULL,
    city character varying(255),
    state_id integer NOT NULL
);


ALTER TABLE public.cities OWNER TO postgres;

--
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

--
-- Name: languages; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.languages (
    language_id integer NOT NULL,
    language character varying(255)
);


ALTER TABLE public.languages OWNER TO postgres;

--
-- Name: movie_association; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.movie_association (
    movie_id integer NOT NULL,
    cinema_hall_id integer NOT NULL
);


ALTER TABLE public.movie_association OWNER TO postgres;

--
-- Name: movies; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.movies (
    movie_id integer NOT NULL,
    movie_name character varying(255),
    language_id integer NOT NULL
);


ALTER TABLE public.movies OWNER TO postgres;

--
-- Name: states; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.states (
    state_id integer NOT NULL,
    state character varying(255)
);


ALTER TABLE public.states OWNER TO postgres;

--
-- Data for Name: cinema_halls; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cinema_halls (cinema_hall_id, hall_addr, hall_name, city_id) FROM stdin;
2	Sarath city mall, Gachibowli	AMB cinemas	2
3	SNL Terminus, Gachibowli	Platinum cinemas	2
4	Near NTR Garden	Prasad's Imax	2
5	Inorbit mall, Madhapur	PVR Inorbit	2
6	AF station shopping complex	The Movie Hall	4
7	Unity One mall	Cinepolis	4
8	Asaf Ali roads	Delite cinemas	4
9	54, community center, sapna cinemas road, east of kailash	M Cinemas	4
10	vasant kunj	PVR Director's cut	4
11	R City mall	INOX-R City	3
12	65, Muzban Road	Sterling Cineplex	3
13	Neptune magnet mall	Carnival Cinemas	3
14	39 Bentinck st, near Tipu sultan masjid	Paradise Cinema hall	7
15	Humayun PI, new market area, Dharmatala	New Empire Cinema	7
16	30 Tarachand Dutta St	Moonlight Cinema Hall	7
17	Plot no. D, Bund garden road	Inox	1
18	spot 18 mall, Rahatani road, Pimpri Chinchwad	City Pride Royal Cinemas	1
19	WestEnd Mall, wireless colony, Aundh	Cinepolis	1
20	20/1 , near Anand Residency, Pascimanagari, Kothrud	City Pride	1
21	ITPL main rd, Mahadevpura	V Cinema	5
22	Mantri square mall	INOX	5
23	Meg Centre, Basantar Auditorium, Manipal Center	Sappers Theatre	5
24	Shankarnag Chitramandira, MG Road	Swagath Shankarnag Chitramandira	5
25	The Forum mall, Koramangala	PVR Cinemas	5
26	Arcot road, Somasundara Bharathi Nagar, Vadapalani	Kamala Cinemas	6
27	Jawaharlal Nehru Road, Ashok Nagar	Kasi Theatre	6
28	Music college road, SBI colony, Raja Annamalai Puram	Tagore Film Centre NFDC	6
29	Forum Vijaya mall	SPI Palazzo	6
\.


--
-- Data for Name: cities; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cities (city_id, city, state_id) FROM stdin;
1	Pune	3
7	Kolkata	6
2	Hyderabad	2
6	Chennai	7
5	Bangalore	5
3	Mumbai	3
4	Delhi	4
\.


--
-- Data for Name: languages; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.languages (language_id, language) FROM stdin;
1	Bengali
2	English
3	Hindi
4	Kannada
5	Malayalam
6	Marathi
7	Tamil
8	Telugu
\.


--
-- Data for Name: movie_association; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.movie_association (movie_id, cinema_hall_id) FROM stdin;
32	2
32	3
32	4
32	5
32	6
32	7
32	8
32	9
32	10
32	11
32	12
32	13
32	14
32	15
32	16
32	17
32	18
32	19
32	20
32	21
32	22
32	23
32	24
32	25
32	26
32	27
32	28
32	29
33	2
33	3
33	4
33	5
33	6
33	7
33	8
33	9
33	10
33	11
33	12
33	13
33	14
33	15
33	16
33	17
33	18
33	19
33	20
33	21
33	22
33	23
33	24
33	25
33	26
33	27
33	28
33	29
34	2
34	3
34	4
34	5
34	6
34	7
34	8
34	9
34	10
34	11
34	12
34	13
34	14
34	15
34	16
34	17
34	18
34	19
34	20
34	21
34	22
34	23
34	24
34	25
34	26
34	27
34	28
34	29
35	2
35	3
35	4
35	5
35	6
35	7
35	8
35	9
35	10
35	11
35	12
35	13
35	14
35	15
35	16
35	17
35	18
35	19
35	20
35	21
35	22
35	23
35	24
35	25
35	26
35	27
35	28
35	29
36	2
36	3
36	4
36	5
36	6
36	7
36	8
36	9
36	10
36	11
36	12
36	13
36	14
36	15
36	16
36	17
36	18
36	19
36	20
36	21
36	22
36	23
36	24
36	25
36	26
36	27
36	28
36	29
37	2
37	3
37	4
37	5
37	6
37	7
37	8
37	9
37	10
37	11
37	12
37	13
37	14
37	15
37	16
37	17
37	18
37	19
37	20
37	21
37	22
37	23
37	24
37	25
37	26
37	27
37	28
37	29
38	2
38	3
38	4
38	5
38	6
38	7
38	8
38	9
38	10
38	11
38	12
38	13
38	14
38	15
38	16
38	17
38	18
38	19
38	20
38	21
38	22
38	23
38	24
38	25
38	26
38	27
38	28
38	29
39	2
39	3
39	4
39	5
39	21
39	22
39	23
39	24
39	25
39	26
39	27
39	28
39	29
40	2
40	3
40	4
40	5
40	21
40	22
40	23
40	24
40	25
40	26
40	27
40	28
40	29
41	26
41	27
41	28
41	29
42	26
42	27
42	28
42	29
43	26
43	27
43	28
43	29
\.


--
-- Data for Name: movies; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.movies (movie_id, movie_name, language_id) FROM stdin;
32	The Conjuring: The Devil made me do it	2
33	Cruella	2
34	Mortal Kombat	2
35	Sandeep aur Pinki farar	3
36	Saina	3
37	Radhey	3
38	Mumbai Saga	3
39	Jathi Ratnalu	8
40	Vakeel Saab	8
41	Mandela	7
42	Karnan	7
43	Master	7
\.


--
-- Data for Name: states; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.states (state_id, state) FROM stdin;
1	Kerala
2	Telangana
3	Maharashtra
4	Delhi
5	Karnataka
6	West Bengal
7	Tamil Nadu
\.


--
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.hibernate_sequence', 43, true);


--
-- Name: cinema_halls cinema_halls_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cinema_halls
    ADD CONSTRAINT cinema_halls_pkey PRIMARY KEY (cinema_hall_id);


--
-- Name: cities cities_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cities
    ADD CONSTRAINT cities_pkey PRIMARY KEY (city_id);


--
-- Name: languages languages_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.languages
    ADD CONSTRAINT languages_pkey PRIMARY KEY (language_id);


--
-- Name: movies movies_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movies
    ADD CONSTRAINT movies_pkey PRIMARY KEY (movie_id);


--
-- Name: states states_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.states
    ADD CONSTRAINT states_pkey PRIMARY KEY (state_id);


--
-- Name: cinema_halls fk10y176nuoy3ohlp8s7vly9fcj; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cinema_halls
    ADD CONSTRAINT fk10y176nuoy3ohlp8s7vly9fcj FOREIGN KEY (city_id) REFERENCES public.cities(city_id);


--
-- Name: movies fk6twg1wl11hks1j8xespmv0se7; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movies
    ADD CONSTRAINT fk6twg1wl11hks1j8xespmv0se7 FOREIGN KEY (language_id) REFERENCES public.languages(language_id);


--
-- Name: movie_association fk92shak3csxyvn8vvdvl7jww2n; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movie_association
    ADD CONSTRAINT fk92shak3csxyvn8vvdvl7jww2n FOREIGN KEY (cinema_hall_id) REFERENCES public.cinema_halls(cinema_hall_id);


--
-- Name: movie_association fki4je8bxyg6y8vogf444vcfj9s; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movie_association
    ADD CONSTRAINT fki4je8bxyg6y8vogf444vcfj9s FOREIGN KEY (movie_id) REFERENCES public.movies(movie_id);


--
-- Name: cities fksu54e1tlhaof4oklvv7uphsli; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cities
    ADD CONSTRAINT fksu54e1tlhaof4oklvv7uphsli FOREIGN KEY (state_id) REFERENCES public.states(state_id);


--
-- PostgreSQL database dump complete
--

