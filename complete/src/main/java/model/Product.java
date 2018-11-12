package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Getter @Setter @NoArgsConstructor
public class Product
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	private String name;

	private BigDecimal price;

	@ManyToOne
	private Category category;

	@ManyToOne
	private Subcategory subcategory;

}
