@Document(collection = "students")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student implements Serializable {
	@Id
	private String id;
	private String name;
	private String DNI;
	private String phone;
	private String email;
}
