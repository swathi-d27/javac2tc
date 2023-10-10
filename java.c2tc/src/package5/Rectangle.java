package package5;

public class Rectangle extends Square{
		private float width,height;
		public Rectangle()
		{
			this.width=5.0f;
			this.height=10.0f;
		}
		public Rectangle(float width, float height) {
			super();
			this.width = width;
			this.height = height;
		}
		void calarea()
		{
			super.area=width*height;
			
		}
		
		public String toString() {
			return "Rectangle [width=" + width + ", height=" + height + "]";
		}
		

	}

