package pl.stanlubanski.parkingplacereservation;

import org.springframework.data.jpa.repository.JpaRepository;

interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
