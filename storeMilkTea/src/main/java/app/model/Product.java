package app.model;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Product implements Serializable {

	@NonNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NonNull
	private String name;

	@NonNull
	private String image;

	@NonNull
	private BigDecimal price;

	@NonNull
	private String size;

	@NonNull
	private Boolean status;

	@NonNull
	@ManyToOne
	@JoinColumn(name = "categoryDetailID")
	private CategoryDetail categoryDetail;

	@NonNull
	@ManyToOne
	@JoinColumn(name = "discountID")
	private Discount discount;

	@NonNull
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
	@Fetch(FetchMode.SELECT)
	@OrderColumn
	private List<Review> reviews;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
	@Fetch(FetchMode.SELECT)
	@OrderColumn
	private List<CartDetail> cartDetails;
}
